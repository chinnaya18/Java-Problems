class TravelPlan {

    String travelerName;
    String tripName;
    String tripNotes;
    String[] destinations;
    double[] expenses;

    static int totalTrips = 0;

    TravelPlan() {
        travelerName = "Unknown";
        tripName = "General Trip";
        tripNotes = "No notes";
        destinations = new String[3];
        expenses = new double[3];
        totalTrips++;
    }

    TravelPlan(String name, String trip, String notes, String[] dest, double[] exp) {
        travelerName = name;
        tripName = trip;
        tripNotes = notes;
        destinations = dest;
        expenses = exp;
        totalTrips++;
    }

    TravelPlan(TravelPlan t) {
        travelerName = t.travelerName;
        tripName = t.tripName;
        tripNotes = t.tripNotes;
        destinations = t.destinations;
        expenses = t.expenses;
        totalTrips++;
    }

    void updateNotes(String newNote) {
        tripNotes = newNote.toUpperCase();
    }

    void addDestination(int index, String place) {
        destinations[index] = place;
    }

    void addExpense(int index, double amount) {
        expenses[index] = amount;
    }

    double totalExpense() {
        double sum = 0;
        for (double e : expenses) {
            sum += e;
        }
        return sum;
    }

    void display() {

        System.out.println("Traveler: " + travelerName);
        System.out.println("Trip: " + tripName);
        System.out.println("Notes: " + tripNotes);

        System.out.print("Destinations: ");
        for (String d : destinations) {
            if (d != null)
                System.out.print(d + " ");
        }

        System.out.print("\nExpenses: ");
        for (double e : expenses) {
            if (e != 0)
                System.out.print(e + " ");
        }

        System.out.println("\nTotal Expense: " + totalExpense());
        System.out.println("----------------------------");
    }

    static void agencyInfo() {
        System.out.println("Global Travels - Smart Travel Planning System");
    }

    static void showStatistics() {
        System.out.println("Total Trips Planned: " + totalTrips);
    }
}

class Main {
    public static void main(String[] args) {

        TravelPlan.agencyInfo();

        TravelPlan t1 = new TravelPlan();
        t1.travelerName = "Alice";
        t1.addDestination(0, "Paris");
        t1.addDestination(1, "Rome");
        t1.addExpense(0, 1200);
        t1.addExpense(1, 900);
        t1.updateNotes("Honeymoon trip");

        String[] d2 = {"Tokyo", "Kyoto", "Osaka"};
        double[] e2 = {1500, 800, 600};
        TravelPlan t2 = new TravelPlan("Bob", "Japan Tour", "Cultural exploration", d2, e2);

        TravelPlan t3 = new TravelPlan(t2);
        t3.travelerName = "Charlie";
        t3.updateNotes("Family vacation");

        t1.display();
        t2.display();
        t3.display();

        TravelPlan.showStatistics();
    }
}
class EventRegistration {

    String participantName;
    String eventPreference;
    String[] sessions;
    int[] ratings;

    static int totalParticipants = 0;

    EventRegistration() {
        participantName = "Unknown";
        eventPreference = "General Event";
        sessions = new String[3];
        ratings = new int[3];
        totalParticipants++;
    }

    EventRegistration(String name, String event, String[] sessions, int[] ratings) {
        this.participantName = name;
        this.eventPreference = event;
        this.sessions = sessions;
        this.ratings = ratings;
        totalParticipants++;
    }

    EventRegistration(EventRegistration obj) {
        this.participantName = obj.participantName;
        this.eventPreference = obj.eventPreference;
        this.sessions = obj.sessions;
        this.ratings = obj.ratings;
        totalParticipants++;
    }

    void updateName(String newName) {
        participantName = newName.toUpperCase();
    }

    void addSession(int index, String sessionName) {
        sessions[index] = sessionName;
    }

    void addRating(int index, int rating) {
        ratings[index] = rating;
    }

    void display() {
        System.out.println("Participant: " + participantName);
        System.out.println("Event Preference: " + eventPreference);

        System.out.print("Sessions: ");
        for (String s : sessions) {
            if (s != null)
                System.out.print(s + " ");
        }

        System.out.print("\nRatings: ");
        for (int r : ratings) {
            if (r != 0)
                System.out.print(r + " ");
        }

        System.out.println("\n----------------------------");
    }

    static void eventInfo() {
        System.out.println("Tech Fest 2025 - Smart Event Registration System");
    }

    static void displayStatistics() {
        System.out.println("Total Participants Registered: " + totalParticipants);
    }
}

class Main {
    public static void main(String[] args) {

        EventRegistration.eventInfo();

        EventRegistration p1 = new EventRegistration();
        p1.updateName("Alice");
        p1.addSession(0, "AI Workshop");
        p1.addSession(1, "Cybersecurity Talk");
        p1.addRating(0, 5);
        p1.addRating(1, 4);

        String[] s2 = {"Robotics", "Cloud Computing", "Data Science"};
        int[] r2 = {5, 4, 5};
        EventRegistration p2 = new EventRegistration("Bob", "Technical Events", s2, r2);

        EventRegistration p3 = new EventRegistration(p2);
        p3.updateName("Charlie");

        p1.display();
        p2.display();
        p3.display();

        EventRegistration.displayStatistics();
    }
}
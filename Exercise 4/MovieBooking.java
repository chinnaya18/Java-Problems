import java.util.Scanner;

class MovieBooking{
    String CustomerName;
    String MovieName;
    StringBuilder SeatDetails;
    String[] Seat;

    public MovieBooking(String CustomerName, String MovieName, StringBuilder SeatDetails, String[] Seat){
        this.CustomerName =  CustomerName;
        this.MovieName = MovieName;
        this.SeatDetails = SeatNumber(SeatDetails);
        this.Seat = addSeat(Seat); 
    }

    StringBuilder SeatNumber(StringBuilder SeatDetails){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your seat details:");
        SeatDetails.append(sc.nextLine());
        return SeatDetails;
    }

    String[] addSeat(String[] Seat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seats:");
        int numSeats = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numSeats; i++){
            System.out.println("Enter seat " + (i + 1) + ":");
            Seat[i] = sc.nextLine();
        }
        return Seat;
    }

    void display(){
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Movie Name: " + MovieName);
        System.out.println("Seat Details: " + SeatDetails);
        System.out.print("Seats: ");
        for(String s : Seat){
            if(s != null){
                System.out.print(s + " ");
            }
        }
        System.out.println("\n------------------------------");
    }

}

class Main{
    public static void main(String[] args) {
        MovieBooking booking1 = new MovieBooking("John Doe", "Inception", new StringBuilder(), new String[10]);
        booking1.display();

        MovieBooking booking2 = new MovieBooking("Alice", "The Matrix", new StringBuilder(), new String[10]);
        booking2.display();

        MovieBooking booking3 = new MovieBooking("David", "Interstellar", new StringBuilder(), new String[10]);
        booking3.display();
    }
}
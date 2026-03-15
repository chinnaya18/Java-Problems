import java.util.Scanner;

class BookReview {

    String Name;
    String title;
    StringBuilder comments;
    int rating[];

    public BookReview(String Name, String title, StringBuilder comments, int[] rating) {
        this.Name = Name;
        this.title = title;
        this.comments = reviewComments(comments);
        this.rating = ratings(rating);
    }

    StringBuilder reviewComments(StringBuilder comments) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your comments:");
        comments.append(sc.nextLine());
        return comments;
    }

    int[] ratings(int[] rating) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rating for Content, Language, Presentation, Overall:");

        for (int i = 0; i < 4; i++) {
            rating[i] = sc.nextInt();
        }

        return rating;
    }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Title: " + title);
        System.out.println("Comments: " + comments);
        System.out.println("Content Rating: " + rating[0]);
        System.out.println("Language Rating: " + rating[1]);
        System.out.println("Presentation Rating: " + rating[2]);
        System.out.println("Overall Rating: " + rating[3]);
        System.out.println("------------------------------");
    }
}

class Main {
    public static void main(String[] args) {

        BookReview review1 = new BookReview("John Doe", "The Great Gatsby", new StringBuilder(), new int[4]);
        review1.display();

        BookReview review2 = new BookReview("Alice", "Harry Potter", new StringBuilder(), new int[4]);
        review2.display();

        BookReview review3 = new BookReview("David", "Atomic Habits", new StringBuilder(), new int[4]);
        review3.display();
    }
}
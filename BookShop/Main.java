package BookShop;

/**
 * Main class to test the Book and related classes.
 */
public class Main {
    public static void main(String[] args) {
        // Create an anonymous subclass of the abstract class Book
        Book b = new Book("The Java Handbook", "John Smith", 499.99, 350) {
            // Optionally, you could override methods or add functionality here.
        };

        // Display the details of the book
        b.showDetail();
    }
}

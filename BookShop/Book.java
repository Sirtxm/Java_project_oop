package BookShop;

/**
 * Abstract class representing a generic Book.
 * Serves as a base class for more specific book types (e.g., Novel, Textbook).
 */
public abstract class Book {
    // Book attributes
    String title;
    String author;
    double price;
    int numberOfPage;

    /**
     * Constructor to initialize the book's basic details.
     * 
     * @param title        Title of the book
     * @param author       Author of the book
     * @param price        Price of the book
     * @param numberOfPage Total number of pages in the book
     */
    public Book(String title, String author, double price, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numberOfPage = numberOfPage;
    }

    /**
     * Display the details of the book.
     */
    void showDetail() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Number of Pages : " + numberOfPage);
    }
}

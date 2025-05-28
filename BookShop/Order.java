package BookShop;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an order placed by a customer in the bookshop.
 * Stores a list of books and calculates the total price.
 */
public class Order {
    private List<Book> orderBook;     // List of books in the order
    private Customer customer;        // Customer who placed the order
    private double totalPrice;        // Total price of the order

    /**
     * Constructor initializes the order with the given customer.
     * 
     * @param customer The customer placing the order
     */
    public Order(Customer customer) {
        this.customer = customer;
        this.orderBook = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    /**
     * Adds a book to the order and updates the total price.
     * 
     * @param book The book to add
     */
    public void addBook(Book book) {
        orderBook.add(book);
        totalPrice += book.price;
    }

    /**
     * Prints the order summary, including customer and book details.
     */
    public void printOrderDetails() {
        System.out.println("===== Order Details =====");
        System.out.println("Customer: " + customer.name);
        System.out.println("Books Ordered:");
        for (Book book : orderBook) {
            System.out.println("- " + book.title + " by " + book.author);
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice);
        System.out.println("=========================");
    }
}

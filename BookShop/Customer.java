package BookShop;

/**
 * Represents a customer in the book shop system.
 */
public class Customer {
    // Customer attributes
    String name;
    String address;
    String email;

    /**
     * Constructor to initialize customer details.
     * 
     * @param name    Customer's name
     * @param address Customer's address
     * @param email   Customer's email
     */
    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    /**
     * Displays customer information.
     */
    void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Email : " + email);
    }

    /**
     * Simulates the customer buying a book.
     * 
     * @param book     The book being purchased
     * @param quantity Number of copies to purchase
     */
    void buy(Book book, int quantity) {
        System.out.println(name + " purchased " + quantity + " copy(ies) of \"" + book.title + "\" by " + book.author);
        System.out.println("Total price: " + (book.price * quantity) + " Baht");
    }
}

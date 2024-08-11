package BookShop;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Book> orderBook;
    private Customer customer;
    private double totalPrice;
    
    public Order(Customer customer){
        this.customer=customer;
        this.orderBook=new ArrayList<>();
        this.totalPrice=0.0;
    }
    public void addBook(Book book){
        orderBook.add(book);
        totalPrice += book.price;
    }
    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Customer: " + customer.name);
        System.out.println("Books ordered:");
        for (Book book : orderBook) {
            System.out.println("- " + book.title + " by " + book.author);
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}


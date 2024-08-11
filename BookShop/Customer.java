package BookShop;

public class Customer {
    String name ;
    String address;
    String email;

    public Customer (String name,String address,String email){
        this.name=name;
        this.address=address;
        this.email=email;
    }
    void showInfo(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Email : "+email);
    }
    void buy(Book book,int quantity){
        System.out.println();
    }
}


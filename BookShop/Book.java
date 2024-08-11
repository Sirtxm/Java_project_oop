package BookShop;

public abstract class Book {
    String title;
    String author;
    double price;
    int numberOfPage;

    public Book(String title,String author,double price,int numberOfPage ){
        this.title=title;
        this.author=author;
        this.price=price;
        this.numberOfPage=numberOfPage;
    }

    void showDetail(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
        System.out.println("Number of Pages : "+numberOfPage);
    }
  
}

    

package book;
import java.util.Scanner;
public class Book {
    Scanner sc = new Scanner(System.in);
    String title ;
    int pageMax ;
    int page=0;
    int bookmark;
    void nameBook(){
        System.out.print("Name of the book :  ");
        title = sc.next();
        System.out.print("How many page :  ");
        pageMax = sc.nextInt();
        System.out.println("--------------------------");
        System.out.println("Name of the book : "+ title );
        System.out.println("Page : "+ pageMax );
    }
    void suggest(){
        System.out.println("1.Go to frist page");
        System.out.println("2.Go to last page");
        System.out.println("3.Go to page ...");
        System.out.println("4.Go to next page");
        System.out.println("5.Go to previous page");
        System.out.println("6.Show total number of pages");
        System.out.println("7.Page now");
        System.out.println("8.Use a bookmark");
        System.out.println("9.Show bookmarked pages");
        System.out.println("10.Go to bookmark");
        System.out.println("11.Remove bookmark");
        System.out.println("12.End");
    }
    void fristPage(){     
        page=1;
        System.out.println("Page : "+page);
    }
    void lastPage(){
        System.out.println("Page : "+pageMax);
        page=pageMax;
    }
    void goTo(){
        System.out.print("Go to page : ");
        page=sc.nextInt();
        if(page<=pageMax){
            System.out.println("Page : "+page);
        }else{
            System.out.println("Please try again!");
        }
    }
    void next(){
        if(page<pageMax){
        page++;
            System.out.println("Go to page : "+page);
    }
        else{
            System.out.println("Please try again");
        }
    }
    void previous(){
        if(page<=pageMax){
        page--;
             System.out.println("Back to page : "+page);    
        }
        else{
            System.out.println("Please try again");
        }
    }
    void bookmark(){
        if(page!=0){
            System.out.println("Use bookmark at page "+page);
        bookmark=page;
        }else{
            System.out.println("The bookmark has not yet been used.");
        }
    }
    void showTotalPage(){
        System.out.println("Total page : "+ pageMax);
    }
    void pageNow(){
        if(page!=0){
        System.out.println("Page : "+page);
        }else{
        System.out.println("This book has not been opened.");
        }
    }
    void showBookmark(){
        if(bookmark!=0){
            System.out.println("Page : "+bookmark);
        }else{
            System.out.println("The bookmark has not yet been used.");
        }
    }
    void removeBookmark(){
        if(bookmark!=0){
        bookmark=0;
            System.out.println("The bookmark has been removed.");
        }else{
            System.out.println("The bookmark has not yet been used.");
        }
    }
    void goToBookmark(){
        if(bookmark!=0){
        page=bookmark;
            System.out.println("Go to : "+page);
        }else{
            System.out.println("The bookmark has not yet been used.");
    }
    }
}

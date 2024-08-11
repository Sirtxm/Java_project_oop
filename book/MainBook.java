package book;
import java.util.Scanner;
public class MainBook {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i=0;
        int choice;
        Book bk = new Book();
        bk.nameBook();
        bk.suggest();
        while (i==0) {
            System.out.print("Select : ");
            choice = a.nextInt();
            switch(choice){
                case 1:
                bk.fristPage();
                break;
                case 2:
                bk.lastPage();
                break;
                case 3:
                bk.goTo();
                break;
                case 4:
                bk.next();
                break;
                case 5:
                bk.previous();
                break;
                case 6:
                bk.showTotalPage();
                break;
                case 7:
                bk.pageNow();
                break;
                case 8:
                bk.bookmark();
                break;
                case 9:
                bk.showBookmark();
                break;
                case 10:
                bk.goToBookmark();
                break;
                case 11:
                bk.removeBookmark();
                break;
                case 12:
                i=1;
                System.out.println("End");
                default:
                System.out.println("Good luck!!!");
                break;

            }
        }


    }
    
}

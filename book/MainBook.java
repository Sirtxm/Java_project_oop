package book;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = 0;
        int choice;

        // Create a new Book object
        Book bk = new Book();

        // Prompt user to enter book information
        bk.nameBook();

        // Show the command menu
        bk.suggest();

        // Main loop to allow user to interact with the book
        while (i == 0) {
            System.out.print("Select : ");
            choice = a.nextInt();

            switch (choice) {
                case 1:
                    bk.fristPage();           // Go to first page
                    break;
                case 2:
                    bk.lastPage();            // Go to last page
                    break;
                case 3:
                    bk.goTo();                // Go to specific page
                    break;
                case 4:
                    bk.next();                // Go to next page
                    break;
                case 5:
                    bk.previous();            // Go to previous page
                    break;
                case 6:
                    bk.showTotalPage();       // Show total number of pages
                    break;
                case 7:
                    bk.pageNow();             // Show current page
                    break;
                case 8:
                    bk.bookmark();            // Bookmark current page
                    break;
                case 9:
                    bk.showBookmark();        // Show bookmarked page
                    break;
                case 10:
                    bk.goToBookmark();        // Go to bookmarked page
                    break;
                case 11:
                    bk.removeBookmark();      // Remove bookmark
                    break;
                case 12:
                    i = 1;                    // Exit the loop and end program
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Good luck!!!");  // Handle invalid input
                    break;
            }
        }
    }
}

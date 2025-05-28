package book;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);

    // Book attributes
    String title;
    int pageMax;
    int page = 0;         // current page
    int bookmark = 0;     // bookmarked page

    // Method to input book name and total pages
    void nameBook() {
        System.out.print("Name of the book: ");
        title = sc.next();
        System.out.print("How many pages: ");
        pageMax = sc.nextInt();

        System.out.println("--------------------------");
        System.out.println("Name of the book: " + title);
        System.out.println("Total pages: " + pageMax);
    }

    // Menu suggestions
    void suggest() {
        System.out.println("1. Go to first page");
        System.out.println("2. Go to last page");
        System.out.println("3. Go to a specific page");
        System.out.println("4. Go to next page");
        System.out.println("5. Go to previous page");
        System.out.println("6. Show total number of pages");
        System.out.println("7. Show current page");
        System.out.println("8. Use a bookmark");
        System.out.println("9. Show bookmarked page");
        System.out.println("10. Go to bookmarked page");
        System.out.println("11. Remove bookmark");
        System.out.println("12. End");
    }

    // Navigate to first page
    void fristPage() {
        page = 1;
        System.out.println("Page: " + page);
    }

    // Navigate to last page
    void lastPage() {
        page = pageMax;
        System.out.println("Page: " + page);
    }

    // Navigate to a specific page
    void goTo() {
        System.out.print("Go to page: ");
        page = sc.nextInt();
        if (page <= pageMax) {
            System.out.println("Page: " + page);
        } else {
            System.out.println("Please try again!");
        }
    }

    // Go to next page
    void next() {
        if (page < pageMax) {
            page++;
            System.out.println("Go to page: " + page);
        } else {
            System.out.println("You are already on the last page.");
        }
    }

    // Go to previous page
    void previous() {
        if (page > 1) {
            page--;
            System.out.println("Back to page: " + page);
        } else {
            System.out.println("You are already on the first page.");
        }
    }

    // Bookmark current page
    void bookmark() {
        if (page != 0) {
            bookmark = page;
            System.out.println("Bookmark set at page " + bookmark);
        } else {
            System.out.println("No page is currently opened to bookmark.");
        }
    }

    // Show total number of pages
    void showTotalPage() {
        System.out.println("Total pages: " + pageMax);
    }

    // Show the current page
    void pageNow() {
        if (page != 0) {
            System.out.println("Current page: " + page);
        } else {
            System.out.println("This book has not been opened yet.");
        }
    }

    // Show bookmarked page
    void showBookmark() {
        if (bookmark != 0) {
            System.out.println("Bookmarked page: " + bookmark);
        } else {
            System.out.println("No bookmark has been used yet.");
        }
    }

    // Remove the bookmark
    void removeBookmark() {
        if (bookmark != 0) {
            bookmark = 0;
            System.out.println("The bookmark has been removed.");
        } else {
            System.out.println("No bookmark to remove.");
        }
    }

    // Go to the bookmarked page
    void goToBookmark() {
        if (bookmark != 0) {
            page = bookmark;
            System.out.println("Navigated to bookmarked page: " + page);
        } else {
            System.out.println("No bookmark has been used yet.");
        }
    }
}

package bird;

import java.util.Scanner;

public class MainBird {

    /**
     * Main method – Entry point of the program
     */
    public static void main(String[] args) {
        // Create a new Bird object
        Bird bi = new Bird();
        int choice;

        Scanner s = new Scanner(System.in);

        // Gather and display initial bird information
        bi.info();

        // Show command menu
        bi.fn();

        // Prompt user to choose an action
        System.out.print("Choose : ");
        choice = s.nextInt();

        // Execute user's choice
        switch (choice) {
            case 1:
                bi.speak(); // Call speak method
                break;
            case 2:
                bi.eat(); // Call eat method
                break;
            case 3:
                System.out.println("Goodbye...");
                break;
            default:
                System.out.println("Error!!! Invalid choice.");
        }

        // Check if the bird needs to poop (after eating)
        bi.poop();
    }
}

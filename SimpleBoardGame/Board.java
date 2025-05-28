package SimpleBoardGame;

/**
 * A simple board class that manages figures on a 1D board of 10 positions.
 */
public class Board {
    // The board is represented as a 1D array of 10 positions (index 0–9)
    Figure brd[] = new Figure[10];

    /**
     * Initializes the board with two sample figures.
     */
    void boardInitiate() {
        brd[0] = new Figure("A", true, 1); // Position 1 (index 0)
        brd[1] = new Figure("B", true, 2); // Position 2 (index 1)
    }

    /**
     * Displays the current state of the board and movable positions for each figure.
     */
    void display() {
        System.out.println("--1--2--3--4--5--6--7--8--9--10--");

        // Print each figure on the board
        for (int n = 0; n < brd.length; n++) {
            if (brd[n] != null)
                System.out.printf("  %s", brd[n].name);
            else
                System.out.print("   ");
        }

        System.out.printf("\n---------------------------------\n\n");

        // Show movement options for each figure
        for (int n = 0; n < brd.length; n++) {
            if (brd[n] != null) {
                brd[n].updateMovableList(this);
                System.out.println("Next turn, Figure " + brd[n].name +
                                   " can move to these positions: " + brd[n].movAbleList);
            }
        }
    }

    /**
     * Moves a figure to a specified target position if the figure is found.
     *
     * @param name           The name/ID of the figure to move
     * @param targetPosition The position (1–10) to move the figure to
     */
    void moveFigure(String name, int targetPosition) {
        System.out.printf("Command: move figure \"%s\" to %d\n", name, targetPosition);
        boolean found = false;

        // Search for the figure by name
        for (int n = 0; n < brd.length; n++) {
            if (brd[n] == null) continue;

            if (brd[n].name.equals(name)) {
                found = true;
                brd[n].move(this, targetPosition);
                break;
            }
        }

        // If no figure with the given name was found
        if (!found)
            System.out.printf("There is no figure named \"%s\" on the board!!! Command aborted.\n\n", name);
    }
}

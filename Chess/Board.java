package Chess;

public class Board {
    // 8x8 chess board represented as a 2D array of Figures
    Figure board[][] = new Figure[8][8];

    // Initialize the board with some sample pieces
    void boardInitiate() {
        board[4][2] = new Figure("A", false, "c4");         // Place generic figure at c4
        board[4][1] = new Bishop("B", false, "b4");         // Place bishop at b4
        board[5][2] = new Pawn("P", true, "c3");            // Place pawn at c3
        display();                                          // Display the board
    }

    // Display the current state of the board
    void display() {
        System.out.println("  a  b  c  d  e  f  g  h  ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].name + "  ");  // Display piece name
                } else {
                    System.out.print("-  ");                    // Empty square
                }
            }
            System.out.println();
        }
        System.out.println("  a  b  c  d  e  f  g  h  ");
    }

    // Attempt to move a piece by name to a new position
    void moveAFigure(String name, String targetPosition) {
        System.out.printf("Command : move figure \"%s\" to %s\n", name, targetPosition);
        boolean found = false;

        // Search the board for a figure with the specified name
        for (int n = 0; n < board.length; n++) {
            for (int m = 0; m < board[n].length; m++) {
                if (board[n][m] == null)
                    continue;

                if (board[n][m].name == name) { // Check name match (Note: better to use .equals())
                    found = true;
                    board[n][m].move(this, targetPosition); // Call the piece's move method
                    break;
                }
            }
        }

        // If no matching figure was found
        if (found == false)
            System.out.printf("There is no figure named as \"%s\" on the board!!! Command aborted.\n\n", name);

        // Show updated board after attempting to move
        display();
    }
}

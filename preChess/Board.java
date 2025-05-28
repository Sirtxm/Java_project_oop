package PreChessV2;

/**
 * A simplified chess board using a 2D character array for demonstration.
 * Provides basic rendering and manual figure placement via freeMove.
 */
public class Board {

    // 8x8 board grid where each cell holds a character representing a figure
    public char[][] board = new char[8][8];

    /**
     * Displays the current state of the board in a readable format.
     * Empty squares are marked with '-'.
     */
    public void displayBoard() {
        System.out.println("  a b c d e f g h ");
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != '\0') {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(8 - i);
        }
        System.out.println("  a b c d e f g h");
    }

    /**
     * Places or removes a figure on the board at the given target position.
     * If the figure is already on that cell, it removes it (toggle-like behavior).
     *
     * @param figure The figure to be moved
     * @param target Target position in algebraic notation (e.g., "e4")
     */
    public void freeMove(Figure figure, String target) {
        int row = target.charAt(0) - 'a'; // Column index (0–7)
        int column = 8 - Character.getNumericValue(target.charAt(1)); // Row index (0–7)

        if (board[column][row] != figure.name) {
            board[column][row] = figure.name; // Place the figure if not already there
        } else if (board[column][row] == figure.name) {
            board[column][row] = '-'; // Remove the figure if already there (toggle)
        } else {
            System.out.println("Can't place your figure there, try again!");
        }

        displayBoard(); // Show updated board
    }
}

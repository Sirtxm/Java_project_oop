package Chess;

/**
 * Base class representing a generic chess figure.
 * Specific types like Pawn, Bishop, etc., should extend this class.
 */
public class Figure {
    String name;          // Symbol or identifier of the figure
    int positionX;        // Column index (0-7)
    int positionY;        // Row index (0-7)
    boolean isWhite = true;  // True if the figure is white, false if black

    /**
     * Constructor initializes the figure's name, color, and position based on standard chess notation (e.g., "e4").
     * 
     * @param name            Identifier of the figure (e.g., "P" for pawn)
     * @param isWhite         True if the figure is white
     * @param currentPosition Starting position (e.g., "e2")
     */
    public Figure(String name, boolean isWhite, String currentPosition) {
        this.name = name;
        this.isWhite = isWhite;
        this.positionX = currentPosition.charAt(0) - 'a';           // Convert file (a-h) to 0-7
        this.positionY = 8 - Character.getNumericValue(currentPosition.charAt(1)); // Convert rank (1-8) to 0-7
    }

    /**
     * Attempts to move the figure to the target position on the board.
     * Default logic allows movement to an empty square or capture of an opponent.
     * Can be overridden by subclasses for specific movement rules.
     * 
     * @param board           The current chess board
     * @param targetPosition  The destination in standard chess notation (e.g., "e4")
     */
    void move(Board board, String targetPosition) {
        int row = targetPosition.charAt(0) - 'a';                     // Target column
        int column = 8 - Character.getNumericValue(targetPosition.charAt(1)); // Target row

        // Check if target is within board bounds
        if ((row < 0 || row >= 8) || (column < 0 || column >= 8)) {
            System.out.println("Position is out of bounds");
            return;
        }

        // Check if the destination square is occupied by a same-side figure
        else if (board.board[column][row] != null &&
                 board.board[column][row].isWhite == this.isWhite) {
            System.out.printf("The destination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n",
                              board.board[column][row].name);
        }

        // Move is valid: update the board and the figure's coordinates
        else {
            board.board[positionY][positionX] = null;  // Clear current position
            board.board[column][row] = this;           // Place figure in new position
            this.positionX = row;
            this.positionY = column;
        }
    }
}

package SimpleBoardGame;

import java.util.ArrayList;

/**
 * Represents a movable figure in a simple board game.
 * Each figure has a name, current position, color, and a list of valid next moves.
 */
public class Figure {
    String name = "";                // Identifier for the figure (e.g., "A", "B")
    int currentPosition = 0;        // 1-based index of current position (1–10)
    Boolean isWhite = true;         // Color flag: true = white, false = black
    ArrayList<String> movAbleList = new ArrayList<>(); // List of valid move positions as strings

    /**
     * Constructor to initialize figure details.
     *
     * @param name      Name or symbol of the figure
     * @param isWhite   True if white, false if black
     * @param position  Starting position on the board (1–10)
     */
    Figure(String name, Boolean isWhite, int position) {
        this.name = name;
        this.currentPosition = position;
        this.isWhite = isWhite;
    }

    /**
     * Moves this figure to a specified position if the move is valid.
     * Prevents moving out of range or onto same-side figure.
     *
     * @param board           The game board instance
     * @param targetPosition  Target position (1–10)
     */
    void move(Board board, int targetPosition) {
        if (targetPosition < 1 || targetPosition > board.brd.length) {
            System.out.println("The specified destination is out of range. Command aborted!\n");
            return;
        }

        // Check if target position is occupied by a same-side figure
        if (board.brd[targetPosition - 1] != null &&
            board.brd[targetPosition - 1].isWhite == this.isWhite) {
            System.out.printf("The destination is occupied by the same-side figure \"%s\". Command aborted!\n\n",
                              board.brd[targetPosition - 1].name);
        } else {
            // Move figure to new position
            board.brd[this.currentPosition - 1] = null;     // Clear current position
            board.brd[targetPosition - 1] = this;           // Place at target
            this.currentPosition = targetPosition;          // Update position
            this.updateMovableList(board);                  // Refresh possible moves
        }
    }

    /**
     * Updates the list of valid move positions based on current board state.
     * A position is valid if it is empty or occupied by an opponent.
     *
     * @param board The current board state
     */
    void updateMovableList(Board board) {
        this.movAbleList.clear();
        for (int n = 0; n < board.brd.length; n++) {
            if (board.brd[n] == null || board.brd[n].isWhite != this.isWhite) {
                this.movAbleList.add(Integer.toString(n + 1)); // Convert index to 1-based position
            }
        }
    }
}

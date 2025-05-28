package Chess;

public class Bishop extends Figure {

    // Constructor to initialize bishop's name, color, and starting position
    public Bishop(String name, boolean isWhite, String currentPosition) {
        super(name, isWhite, currentPosition);
    }

    // Method to move the bishop to the target position
    void move(Board board, String targetPosition) {
        // Convert targetPosition (e.g., "d4") to board indices
        int row = targetPosition.charAt(0) - 'a'; // column (a-h) to 0–7
        int column = 8 - Character.getNumericValue(targetPosition.charAt(1)); // row (1–8) to 0–7

        // Check if the target is outside the board boundaries
        if ((row < 0 || row >= 8) || (column < 0 || column >= 8)) {
            System.out.println("Position is out of bounds");
            return;
        }

        // Check if the destination square is occupied by a same-side piece
        else if ((board.board[column][row] != null && board.board[column][row].isWhite == this.isWhite)) {
            System.out.printf("The destination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n",
                    board.board[column][row].name);
        }

        // Calculate difference in x and y axes
        int deltaX = row - this.positionX;
        int deltaY = column - this.positionY;

        // Check if the move is NOT diagonal (bishop can only move diagonally)
        if (Math.abs(deltaX) == Math.abs(deltaY)) {
            System.out.println("Bishop can't move there");
            return;
        }

        // Move is allowed (according to this logic) → perform the move
        else {
            board.board[positionY][positionX] = null;      // Clear current position
            board.board[column][row] = this;               // Place bishop on new position
            this.positionX = row;                          // Update bishop's internal coordinates
            this.positionY = column;
        }
    }
}

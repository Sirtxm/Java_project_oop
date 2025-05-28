package Chess;

public class Pawn extends Figure {

    // Constructor for Pawn
    public Pawn(String name, boolean isWhite, String currentPosition) {
        super(name, isWhite, currentPosition);
    }

    // Track if the pawn has already moved
    private boolean isSecondTurn;

    /**
     * Handles pawn movement logic, including forward movement,
     * initial double-step, diagonal captures, and boundary checks.
     */
    void move(Board board, String targetPosition) {
        // Convert target position from chess notation to board indices
        int row = targetPosition.charAt(0) - 'a';
        int column = 8 - Character.getNumericValue(targetPosition.charAt(1));

        int deltaX = row - this.positionX;
        int deltaY = column - this.positionY;

        // Check if the move is out of bounds
        if ((row < 0 || row >= 8) || (column < 0 || column >= 8)) {
            System.out.println("Position is out of bounds");
            return;
        }

        // Case: Target occupied by same-side figure
        else if (board.board[column][row] != null && board.board[column][row].isWhite == this.isWhite) {
            System.out.printf("The destination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n", board.board[column][row].name);
        }

        // Case: Path blocked by opponent (not a diagonal attack)
        else if (board.board[column][row] != null && board.board[column][row].isWhite != this.isWhite) {
            System.out.printf("There's a figure \"%s\" blocking the way and you can't cross it, Command abort!!!\n\n", board.board[column - 1][row].name);
        }

        // Case: Valid diagonal capture
        else if (Math.abs(deltaY) == 1 && Math.abs(deltaX) == 1 && board.board[column][row] != null && board.board[column][row].isWhite != this.isWhite) {
            board.board[positionY][positionX] = null;
            board.board[column][row] = this;
            this.positionX = row;
            this.positionY = column;
            return;
        }

        // Case: Illegal lateral movement (X-axis)
        else if (Math.abs(deltaX) > 0) {
            System.out.println("Can't move sideways");
            return;
        }

        // Case: First move - allow 2 steps forward
        else if (!this.isSecondTurn && Math.abs(deltaY) <= 2 && board.board[column][row] == null && board.board[column + 1][row] == null) {
            board.board[positionY][positionX] = null;
            board.board[column][row] = this;
            this.positionX = row;
            this.positionY = column;
            this.isSecondTurn = true;
            return;
        }

        // Case: Regular 1-step forward move after first turn
        else if (this.isSecondTurn && Math.abs(deltaY) == 1 && deltaY < 1 && board.board[column][row] == null) {
            board.board[positionY][positionX] = null;
            board.board[column][row] = this;
            this.positionX = row;
            this.positionY = column;
            return;
        }

        // Fallback for invalid moves
        else {
            System.out.println("Please try again!!!");
        }
    }
}

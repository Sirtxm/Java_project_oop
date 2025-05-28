package Chess;

public class ChessBoard {
    public static void main(String[] args) {
        // Create and initialize the chess board with some sample pieces
        Board brd = new Board();
        brd.boardInitiate(); 

        // === Test Cases ===

        // Test: Pawn tries to move to a square occupied by same-side piece (should fail)
        brd.moveAFigure("P", "c4");  

        // Test: Uncomment to try illegal move (e.g., moving 3 squares forward - invalid for Pawn)
        // brd.moveAFigure("P", "c6");  

        // Test: Pawn tries to jump over another piece (should fail)
        // brd.moveAFigure("P", "c5"); 

        // Test: Legal move - pawn moves diagonally to capture (only valid if enemy is there)
        // brd.moveAFigure("P", "b4");

        // Test: First-move 2-step forward move (valid for pawn)
        // brd.moveAFigure("P", "c5");  

        // Test: Diagonal capture (valid if enemy present at d6)
        // brd.moveAFigure("P", "d6"); 
    }
}

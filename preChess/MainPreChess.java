package PreChessV2;

public class MainPrechess {
   
    public static void main(String[] args) {
        // Create a new chess board
        Board chessBoard = new Board();

        // Create two figure objects:
        // f1: White figure 'A' starting at a4
        // f2: Black figure 'B' starting at a2
        Figure f1 = new Figure('A', "W", "a4");
        Figure f2 = new Figure('B', "B", "a2");

        // Display the initial state of the board
        chessBoard.displayBoard();

        // Move figure f2 (B) to a5
        chessBoard.freeMove(f2, "a5");

        // Move figure f2 (B) to a6
        chessBoard.freeMove(f2, "a6");

        // Move figure f1 (A) to e6
        chessBoard.freeMove(f1, "e6");
    }
}

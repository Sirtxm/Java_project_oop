package PreChessV2;

public class MainPrechess {
   
    public static void main(String[] args) {
        Board chessBoard=new Board();
        Figure f1=new Figure('A', "W","a4");
        Figure f2=new Figure('B', "B","a2");
        chessBoard.displayBoard();
        chessBoard.freeMove(f2, "a5");
        chessBoard.freeMove(f2, "a6");
        chessBoard.freeMove(f1,"e6");
    }
}

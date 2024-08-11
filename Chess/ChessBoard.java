package Chess;

public class ChessBoard {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate(); 
     brd.moveAFigure("P", "c4");  //testกินพวกเดียวกันไม่ได้
        // brd.moveAFigure("P", "c6");  //testเดิน3ช่องตอนเริ่มไม่ได้
        // brd.moveAFigure("P", "c5"); //testเดินข้ามหัวfigureไม่ได้
        // brd.moveAFigure("P", "b4");
        // brd.moveAFigure("P", "c5");  //testตาแรกเดินได้2ช่อง
        // brd.moveAFigure("P", "d6"); //testกินเฉียงได้
    }
}

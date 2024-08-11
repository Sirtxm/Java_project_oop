package preChess;

public class MainPreChess {
    public static void main(String[] args) {
        Board b = new Board();
        Figure f1 = new Figure();
        Figure f2 = new Figure();
       
        f1.createFigure('a');
        f2.createFigure('b');
        b.setBoard(f2, 3);
        b.setBoard(f2, 5);
    }
}

   
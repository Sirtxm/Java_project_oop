package SimpleBoardGame;

import java.util.ArrayList;

public class Figure {
    String name= "";
    int currentPosition = 0;
    Boolean isWhite = true;         //แยกขาวดำ
    ArrayList<String> movAbleList = new ArrayList<String>();

    Figure(String name,Boolean isWhite,int position){
        this.name = name;
        this.currentPosition = position; 
        this.isWhite = isWhite;
    }

    void move(Board board , int targetPosition){
        if((targetPosition < 1) || (targetPosition>board.brd.length)) {
            System.out.println("The speicified destination is out of range, Command abort!!!\n");
            return;
    }
        else if(board.brd[targetPosition-1] != null && board.brd[targetPosition-1].isWhite == this.isWhite)
            System.out.printf("The distination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n", board.brd[targetPosition-1].name);
        else {
            board.brd[this.currentPosition-1] = null;
            board.brd[targetPosition-1] = this;
            this.currentPosition = targetPosition;
            this.updateMovableList(board);
        }
        }
        void updateMovableList(Board board){
            this.movAbleList.clear();
            for(int n=0; n<board.brd.length;n++)
                if(board.brd[n]==null || board.brd[n].isWhite != this.isWhite)
                    this.movAbleList.add(Integer.toString(n+1));
            
        }
}

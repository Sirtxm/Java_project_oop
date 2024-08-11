package Chess;

public class Board {
    Figure board [][] = new Figure[8][8];
    void boardInitiate(){
        board [4][2] = new Figure("A",false,"c4");
        board [4][1] = new Bishop("B",false,"b4"); 
        board [5][2] = new Pawn("P",true, "c3");
       display();
    }
    void display(){
        System.out.println("  a  b  c  d  e  f  g  h  ");  
        for (int i = 0; i < board.length; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].name + "  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
            
        }
        System.out.println("  a  b  c  d  e  f  g  h  ");
    }
    void moveAFigure(String name,String targetPosition){  
        System.out.printf("Command : move figure \"%s\" to %s\n", name,targetPosition);
        boolean found = false;
        for(int n=0;n<board.length;n++){
            for(int m=0;m<board[n].length;m++){
                if(board[n][m] == null) 
                    continue;
                if(board[n][m].name == name){
                    found = true;
                    board[n][m].move(this,targetPosition);
                    break;
            }

        }
    }
        if(found == false)
            System.out.printf("There is no figure named as \"%s\" in the board!!!, Command abort\n\n",name);
            display();
        }
    }

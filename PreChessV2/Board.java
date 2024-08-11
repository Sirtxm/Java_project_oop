package PreChessV2;

public class Board {
   
   
    public char[][] board = new char[8][8];
    
     public void displayBoard(){        
        System.out.println("  a b c d e f g h ");  
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != '\0') {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(8-i);
        }
        System.out.println("  a b c d e f g h");
    }

    public void freeMove(Figure figure,String target){  
        
        int row = target.charAt(0) - 'a';                                       
        int column = 8 - Character.getNumericValue(target.charAt(1)) ;          
        if (board[column][row]!= figure.name){                                        
            board[column][row] = figure.name;
        }
        if (board[column][row]== figure.name){                                        
            board[column][row] = '-';
        }
        else{
            System.out.println("Can't place your figure there, try again!");
        }
        displayBoard();
    }
}



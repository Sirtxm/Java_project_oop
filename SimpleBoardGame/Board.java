package SimpleBoardGame;

public class Board {
    Figure brd[] = new Figure[10];
    void boardInitiate(){
        brd[0] = new Figure("A",true, 1);
        brd[1] = new Figure("B",true, 2);
    }
    void display(){
        System.out.println("--1--2--3--4--5--6--7--8--9--10--");
        for(int n = 0;n<brd.length;n++){
            if(brd[n] != null)
                System.out.printf("  %s", brd[n].name);
            else
                System.out.print("   ");
            }
            System.out.printf("\n---------------------------------\n\n");
            for(int n =0;n<brd.length;n++){
                if(brd[n]!=null) {
                    brd[n].updateMovableList(this);
                    System.out.println("Next turn, Figure "+brd[n].name+" can move to this positions: "+brd[n].movAbleList);
                }
            }
        }
        void moveFigure(String name,int targetPosition){
            System.out.printf("Command : move figure \"%s\" to %d\n", name,targetPosition);
            boolean found = false;
            for(int n=0;n<brd.length;n++){
                if(brd[n] == null) 
                continue;
                if(brd[n].name == name){
                    found = true;
                    brd[n].move(this,targetPosition);
                    break;
                }

            }
            if(found == false)
                System.out.printf("There is no figure named as \"%s\" in the board!!!, Command abort\n\n",name);
            }
        }

    


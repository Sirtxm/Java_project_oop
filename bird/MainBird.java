package bird;
import java.util.Scanner;
public class MainBird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird bi = new Bird ();
        int choice;
        Scanner s = new Scanner(System.in);
        bi.info();
        bi.fn();
        System.out.print("Choose : ");
         choice = s.nextInt();
        switch(choice){
             case 1:
                 bi.speak();
                 break;
             case 2:
                 bi.eat();
                 break;
             case 3:
                 System.out.println("Goodbye...");
                 break;
             default:
                 System.out.println("Error!!!");        
         }
        bi.poop();
    }
    
}
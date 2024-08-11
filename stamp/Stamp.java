package stamp;

/**
 *
 * @author teera
 */
public class Stamp {
    String text = "CPE";
    int maxNumber = 5 ;
    int numOfStamp = 5;
    void stamp () {
        if(numOfStamp>0){
            System.out.println(text);
            numOfStamp--;
        }else
            System.out.println("Run out of the ink, please refill!!!");
    }
    void maxRefill() {
        numOfStamp = maxNumber;
        System.out.println("The stamp has been fully refill");
    }
    
}
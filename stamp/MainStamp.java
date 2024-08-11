package stamp;

/**
 *
 * @author teera
 */
public class MainStamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stamp st = new Stamp ();
        System.out.println(st.numOfStamp);
        st.stamp();
        System.out.println(st.numOfStamp);
        System.out.println(st.numOfStamp);
        System.out.println(st.numOfStamp);
        st.stamp();
        st.stamp();
        st.stamp();
        st.stamp();
        st.stamp();
        st.maxRefill();
        
        
    }
    
}
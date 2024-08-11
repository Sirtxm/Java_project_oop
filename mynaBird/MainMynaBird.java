package mynaBird;

public class MainMynaBird {
    public static void main(String[] args){
        Mynabird mb1 = new Mynabird();
        Mynabird mb2 = new Mynabird();       
        mb1.mynaBird("David",5,5,'M');
        mb2.mynaBird("Maria",5,5,'F');
        mb2.breed(mb1);
        
    }
}

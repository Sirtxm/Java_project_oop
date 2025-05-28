package mynaBird;

public class MainMynaBird {
    public static void main(String[] args) {
        // Create two Mynabird objects
        Mynabird mb1 = new Mynabird();
        Mynabird mb2 = new Mynabird();

        // Initialize the first bird: name = David, age = 5, weight = 5, gender = M (Male)
        mb1.mynaBird("David", 5, 5, 'M');

        // Initialize the second bird: name = Maria, age = 5, weight = 5, gender = F (Female)
        mb2.mynaBird("Maria", 5, 5, 'F');

        // Attempt to breed Maria (female) with David (male)
        mb2.breed(mb1);
    }
}

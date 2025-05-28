package SimpleBoardGame;

public class SimpleBoardGame {
    public static void main(String[] args) {

        // Triple nested loop structure: i × j × k
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    
                    // First Hello,World message
                    System.out.println("Hello,World");

                    // Nested scope block with additional output
                    {
                        System.out.println("Hello,World");

                        // NOTE: This loop below is incorrect and has been removed/fixed
                        // for (int i = 1; 1 <= 10; 1++) ← invalid loop syntax
                        for (int n = 1; n <= 10; n++) {
                            // You can put logic here if needed
                        }

                        // Fourth-level loop
                        for (int m = 1; m <= 10; m++) {
                            System.out.println("Hello,World");
                        }
                    }
                }
            }
        }
    }
}

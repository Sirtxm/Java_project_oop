package cup;

public class MainCup {
    public static void main(String[] args) {
        // Create two cup objects
        Cup c1 = new Cup();
        Cup c2 = new Cup();

        // Initialize cup A with 500ml capacity
        c1.setupCup('A', 500);

        // Attempt to pour all water from cup B before it is initialized (demonstrates empty state)
        c2.pourAllWater();

        // Initialize cup B with 500ml capacity
        c2.setupCup('B', 500);

        // Check current water in cup B (should be 0)
        c2.checkWater();

        // Fill 400ml into cup A
        c1.fillWater(400);

        // Pour 300ml from cup A to cup B
        c1.pourToOther(300, c2);

        // Check water levels in both cups
        c1.checkWater();
        c2.checkWater();

        // Pour 100ml back from cup B to cup A
        c2.pourToOther(100, c1);

        // Fill cup A to its full capacity
        c1.fullFill();
        c1.checkWater();

        // Pour all water from cup A
        c1.pourAllWater();
        c1.checkWater();

        // Attempt to overfill cup B with 600ml (should spill 100ml)
        c2.fillWater(600);
        c2.checkWater();

        // Try to pour 900ml from cup B to cup A (invalid because cup B doesn't have that much)
        c2.pourToOther(900, c1);
    }
}

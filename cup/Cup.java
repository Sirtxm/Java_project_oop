package cup;

/**
 * The Cup class simulates the behavior of a physical cup with water volume operations.
 */
public class Cup {
    int cup = 0;          // Current volume of water in the cup (ml)
    int capacity;         // Maximum capacity of the cup (ml)
    int cupOther;         // (Unused field, possibly intended for other cup operations)

    /**
     * Initializes the cup with a name and its capacity.
     *
     * @param name     The identifier/label of the cup
     * @param capacity Maximum capacity of the cup in milliliters
     */
    public void setupCup(char name, int capacity) {
        this.capacity = capacity;
        System.out.println("-------------------------------------------");
        System.out.println("Cup " + name);
        System.out.println("The capacity of the cup is " + capacity + " ml.");
    }

    /**
     * Empties all the water in the cup.
     */
    public void pourAllWater() {
        if (this.cup > 0) {
            this.cup = 0;
            System.out.println("-------------------------------------------");
            System.out.println("The cup is now empty.");
        } else {
            System.out.println("There is no water to pour.");
        }
    }

    /**
     * Pours a specified amount of water from the cup.
     *
     * @param water Amount of water to pour out (ml)
     */
    public void pourWater(int water) {
        if (this.cup > 0 && water <= this.cup) {
            this.cup -= water;
            System.out.println("-------------------------------------------");
            System.out.println("The capacity of the cup is " + this.cup + " ml.");
        } else if (water > this.cup) {
            System.out.println("-------------------------------------------");
            System.out.println("The water you pour out is more than the water in the cup.");
        } else if (this.cup == 0) {
            System.out.println("-------------------------------------------");
            System.out.println("There is no water to pour.");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("Please try again!!!");
        }
    }

    /**
     * Fills the cup to its maximum capacity.
     */
    public void fullFill() {
        System.out.println("-------------------------------------------");
        if (this.cup >= 0 && this.cup != this.capacity) {
            this.cup = this.capacity;
            System.out.println("The cup is now full: " + this.cup + " ml.");
        } else {
            System.out.println("This cup is already full.");
        }
    }

    /**
     * Adds water to the cup and handles spillage if overfilled.
     *
     * @param water Amount of water to add (ml)
     */
    public void fillWater(int water) {
        int spill;
        System.out.println("-------------------------------------------");

        if (this.cup >= 0 && this.cup <= this.capacity && water <= this.capacity) {
            this.cup += water;

            if (this.cup > this.capacity) {
                spill = this.cup - this.capacity;
                this.cup = this.capacity;
                System.out.println("Water spilled: " + spill + " ml.");
                System.out.println("The capacity of the cup is " + this.cup + " ml.");
            } else {
                System.out.println("Filled water: " + water + " ml.");
                System.out.println("The capacity of the cup is " + this.cup + " ml.");
            }

        } else if (this.cup < water) {
            this.cup = this.capacity;
            spill = water - this.capacity;
            System.out.println("Water spilled: " + spill + " ml.");
            System.out.println("This cup is full.");
        } else {
            System.out.println("Please try again!!!");
        }
    }

    /**
     * Pours water from this cup into another cup.
     *
     * @param water Amount of water to pour (ml)
     * @param cup   The receiving cup object
     */
    public void pourToOther(int water, Cup cup) {
        if (this.cup >= 0 && water <= this.cup) {
            this.cup -= water;
            cup.cup += water;
            System.out.println("-------------------------------------------");
            System.out.println("Water was poured into another cup.");
            System.out.println("The capacity of the cup is " + this.cup + " ml.");
        } else if (this.cup < water) {
            this.cup = this.capacity;
            System.out.println("This cup is full.");
        }
    }

    /**
     * Displays the current amount of water in the cup.
     */
    public void checkWater() {
        System.out.println("-------------------------------------------");
        System.out.println("Check water");
        System.out.println("The capacity of the cup is " + this.cup + " ml.");
    }
}

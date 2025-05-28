package mynaBird;

import java.util.Scanner;

/**
 * The Mynabird class simulates a myna bird with basic behaviors
 * such as speaking, eating, pooping, and breeding.
 */
public class Mynabird {
    int age;
    String name;
    String baby;
    char gender;
    int weight;
    int weightStomach = 0; // Amount of food currently in the stomach

    /**
     * Initializes the myna bird with name, age, weight, and gender.
     *
     * @param name   Bird's name
     * @param age    Bird's age
     * @param weight Bird's weight
     * @param gender Bird's gender ('M', 'F', etc.)
     */
    void mynaBird(String name, int age, int weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
    }

    /**
     * Prompts the user for a phrase and has the bird "speak" it.
     * If nothing is said, it will state its age.
     */
    void speak() {
        String word;
        Scanner w = new Scanner(System.in);
        System.out.print("What do you want me to say? : ");
        word = w.nextLine();

        if (word.isEmpty())
            System.out.println("My age is " + this.age + " year old");
        else
            System.out.println(this.name + " said : " + word);

        w.close(); // Note: Closing Scanner that wraps System.in can cause issues if reused
    }

    /**
     * Feeds the bird. If the amount exceeds the bird's capacity, it will vomit.
     *
     * @param food Amount of food in grams
     */
    void eat(int food) {
        if (food <= this.weight && this.weight > this.weightStomach) {
            this.weightStomach += food;
            System.out.println(this.name + " eats : " + food + " g.");
            if (this.weightStomach > this.weight) {
                System.out.println(this.name + " vomits");
                this.weightStomach -= food;
            }
        } else {
            this.weightStomach = 0;
            System.out.println(this.name + " vomits");
        }
    }

    /**
     * Reduces the food stored in the stomach.
     *
     * @param poop Amount to poop in grams
     */
    void poop(int poop) {
        if (poop <= this.weightStomach) {
            this.weightStomach -= poop;
            System.out.println(name + " poop : " + poop);
        } else {
            System.out.println(name + " can't poop");
        }
    }

    /**
     * Breeds this bird with another if they are of different genders.
     * Generates a new Mynabird object representing the baby.
     *
     * @param breed The partner Mynabird
     */
    void breed(Mynabird breed) {
        if (this.gender != breed.gender) {
            System.out.println(this.name + " and " + breed.name + " are mating");
            System.out.println("Myna bird child is born");

            // Create a baby name using initials of both parents
            String baby = "" + this.name.charAt(0) + breed.name.charAt(0);

            Mynabird bird = new Mynabird();
            bird.mynaBird(baby, 0, 10, 'U'); // 'U' = Unknown gender
        } else {
            System.out.println(this.name + " and " + breed.name + " can't mate because they have the same gender.");
        }
    }
}

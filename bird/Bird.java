package bird;
import java.util.Scanner;

public class Bird {
    Scanner sc = new Scanner(System.in);

    // Bird attributes
    String name;
    String text;
    int food;
    int age;
    int weight;
    int weightStomach;
    int stomach;
    int choice;

    // Method to input and display bird information
    void info(){
        System.out.println("Create your own myna bird.");
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("Age : ");
        age = sc.nextInt();
        System.out.print("Weight (g): ");
        weight = sc.nextInt();

        // Initial food in stomach is 20g less than total weight
        weightStomach = weight - 20;

        // Display bird information
        System.out.println("----------- Info -----------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " y");
        System.out.println("Weight : " + weight + " g");
        System.out.println("Weight of food in the stomach = " + weightStomach + " g");
        System.out.println("*** Calculation: weight of food in the stomach = weight - 20 (g) ***");     
    }

    // Menu for available actions
    void fn(){
        System.out.println("---------- Command Menu -----------");
        System.out.println("Press 1. Speak");
        System.out.println("Press 2. Eat");
        System.out.println("Press 3. End"); 
    }

    // Bird speaks a given text or age
    void speak(){       
        System.out.println("---------- Speak -----------");
        System.out.print("What do you want me to say? : ");
        sc.nextLine(); // clear buffer
        text = sc.nextLine();

        if (text.isEmpty())
            System.out.println("My age is " + age + " years old");
        else
            System.out.println(name + " said: " + text);
    }

    // Feed the bird and adjust food weight
    void eat(){
        System.out.println("---------- Eat -----------");
        System.out.println("Myna bird needs food!!!");
        System.out.println("Let's feed the bird");
        System.out.print("How much to feed " + name + " (g): ");
        food = sc.nextInt();

        weightStomach += food;

        // Check if the bird is overfed
        if (weightStomach > weight) {
            System.out.println("I need to poop now!!!");
        } else {
            System.out.println("Thank you for the food");
        }
    }

    // Bird poops if overfed
    void poop(){  
        if (weightStomach > weight) {
            System.out.println(name + " Poop: " + food + " g");
            System.out.println("Weight: " + weight);
        } else {
            System.out.println("--------------------------");
        }
    }
}

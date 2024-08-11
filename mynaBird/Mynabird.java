package mynaBird;
import java.util.Scanner;

public class Mynabird {
    int age;
    String name;
    String baby;
    char gender;
    int weight;
    int weightStomach = 0;
    void mynaBird(String name, int age, int weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
    }
    void speak() {
        String word;
        Scanner w = new Scanner(System.in);
        System.out.print("What do you want me to say? : ");
        word = w.nextLine();
        if (word.isEmpty())
            System.out.println("My age is " + this.age + " year old");
        else {
            System.out.println(this.name + " said : " + word);
        }
        w.close();
    }
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
    void poop(int poop) {
        if (poop <= this.weightStomach) {
            this.weightStomach -= poop;
            System.out.println(name + " poop : " + poop);
        } else {
            System.out.println(name + " can't poop");
        }
    }
    void breed(Mynabird breed) {
        if (this.gender != breed.gender) {
            System.out.println(this.name + " and " + breed.name + " are mating");
            System.out.println("Myna bird child is born");
            String baby = "" + this.name.charAt(0) + breed.name.charAt(0);
            Mynabird bird = new Mynabird();
            bird.mynaBird(baby, 0, 10, 'U');
        } else {
            System.out.println(this.name + " and " + breed.name + " can't mate because they have the same gender.");
        }
    }
}

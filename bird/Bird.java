package bird;
import java.util.Scanner;
public class Bird {
    Scanner sc = new Scanner(System.in);
    String name;
    String text;
    int food;
    int age;
    int weight;
    int weightStomach;
    int stomach;
    int choice;
    
    
    void info(){
        System.out.println("Create your own myna bird.");
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("Age : ");
        age = sc.nextInt();
        System.out.print("Weight(g) = ");
        weight = sc.nextInt();
        weightStomach = weight-20;
       
        System.out.println("-----------Info-----------");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age +" y");
        System.out.println("Weigh : "+weight+" g");
        System.out.println("Weight of food in the stomach = "+weightStomach+" g");
        System.out.println("***Weight of food in the stomach = weight-20(g)***");     
    }
     void fn(){
         System.out.println("----------Order-----------");
         System.out.println("Press 1.Speak");
         System.out.println("Press 2.Eat");
         System.out.println("Press 3.End"); 
         }
     void speak(){       
         System.out.println("----------Speak-----------");
         System.out.print("What do you want me to say? : ");
         sc.nextLine();
         text = sc.nextLine();
        
         if(text.isEmpty())
             System.out.println("My age is " +age+" year old");
      else{
    System.out.println(name +" said : "+ text);
}
        
     }
     void eat(){
         System.out.println("----------Eat-----------");
         System.out.println("Myna bird need food!!!");
         System.out.println("Let's feed the bird");
         System.out.print("How much to feed "+ name + " (g): ");
         food = sc.nextInt();
         weightStomach = food+weightStomach;        
         if(weightStomach>weight){            
             System.out.println("I need to poop now!!!"); 
             
         }else{
             System.out.println("Thank you for food");
         }
             
         }
    void poop(){  
        if(weightStomach>weight){         
            System.out.println(name+" Poop : " +food+" g");           
            System.out.println("Weight : "+weight);
        }else{
            System.out.println("--------------------------");
        }
    }
    
         
     }
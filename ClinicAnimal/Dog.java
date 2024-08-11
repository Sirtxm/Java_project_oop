package ClinicAnimal;

public class Dog implements Animal {
    String breed;
    String furColor;
    boolean isTrained;
    String sound = "Woof Woof!!!";
    
    public Dog(String name,int age,String type,String breed,String furColor,boolean isTrained){
        super(name, age, type, breed, furColor, isTrained);
    }
    @Override
    public String makeSound(){
        return sound;
    }
    
}

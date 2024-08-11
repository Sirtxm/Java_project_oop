package ClinicAnimal;

public class Cat implements Animal{
    String sound = "meow meow";

    public Cat (String name,int age,String type,String breed,String furColor,boolean isTrained){
        super(name, age, type, breed, furColor, isTrained);
    }

    public String makeSound(){
        return sound;
    }
  
    }


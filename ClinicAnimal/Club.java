package ClinicAnimal;
import java.util.ArrayList;
public class Club {
    private String clubName;
    ArrayList<Animal> member = new ArrayList<>();

    public Club(String clubName){
        this.clubName=clubName;
    }
    void addMem(Animal a){
        member.add(a);

    }
    }


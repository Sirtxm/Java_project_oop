package cup;
public class Cup {
    int cup=0; //น้ำในแก้ว
    int capacity; //ความจุ
    int cupOther;
    public void setupCup(char name,int capacity){ //setup
        this.capacity=capacity;
        System.out.println("-------------------------------------------");
        System.out.println("Cup "+name);
        System.out.println("The capacity of the cup is "+capacity+" ml.");
    }
    public void pourAllWater(){ //เทน้ำหมด
        if(this.cup>0){
            this.cup=0;
            System.out.println("-------------------------------------------");
            System.out.println("The capacity of the cup is "+this.cup+" ml.");
        }else{
            System.out.println("There is no water to pour.");
        }
    }
    public void pourWater(int water){ //เทน้ำ
        if(this.cup>0&&water<=this.cup){
            this.cup-=water;
            System.out.println("-------------------------------------------");
            System.out.println("The capacity of the cup is "+this.cup+" ml.");
        }else if(water>this.cup){
            System.out.println("-------------------------------------------");
            System.out.println("The water you pour out is more than the water in the cup.");
        }else if(this.cup==0){
            System.out.println("-------------------------------------------");
            System.out.println("There is no water to pour.");
        }else{
            System.out.println("-------------------------------------------");
            System.out.println("Please try again!!!");
        }
    }
    public void fullFill(){ //เติมเต็ม
        System.out.println("-------------------------------------------");
        if(this.cup>=0&&this.cup!=this.capacity){
            this.cup=this.capacity;
            System.out.println("The capacity of the cup is "+this.cup+" ml.");
        }else {
            System.out.println("This cup is full.");
        }
    }
    public void fillWater(int water){      //เติมน้ำ
        int spill;
        System.out.println("-------------------------------------------");
        if(this.cup>=0&&this.cup<=this.capacity&&water<=this.capacity){
            this.cup+=water;
            if(this.cup>this.capacity){
                spill=this.cup-this.capacity;
                this.cup=this.capacity;
                System.out.println("The water in the glass was spilled : "+spill+" ml.");
                System.out.println("The capacity of the cup is "+this.cup+" ml.");
            }else{
            System.out.println("Fill water : "+this.cup+" ml.");
            System.out.println("The capacity of the cup is "+this.cup+" ml.");
            }
        }else if(this.cup<water){
            this.cup=this.capacity;
            spill=water-this.capacity;
            System.out.println("The water in the glass was spilled : "+spill+" ml.");
            System.out.println("This cup is full.");
        }else{
            System.out.println("Please try again!!!");
        }
    }
    public void pourToOther(int water,Cup cup){
        if(this.cup>=0&&water<=this.cup){
            this.cup-=water;
            cup.cup+=water;
            System.out.println("-------------------------------------------");
            System.out.println("Water was poured into another cup.");
            System.out.println("The capacity of the cup is "+this.cup+" ml.");
        }else if(this.cup<water){
            this.cup=this.capacity;
            System.out.println("This cup is full.");
        }
        
    }
    public void checkWater(){
        System.out.println("-------------------------------------------");
        System.out.println("Check water");
        System.out.println("The capacity of the cup is "+this.cup+" ml.");
    }
}


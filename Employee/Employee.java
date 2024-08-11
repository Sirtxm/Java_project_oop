package Employee;

public abstract class Employee {
    String name ;
    int age ;
    double baseSalary ;

    public Employee(String name,int age,double baseSalary){
        this.name=name;
        this.age=age;
        this.baseSalary=baseSalary;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public double calculateSalary(){
        return baseSalary;
    }
    void sleep(){}
    
}

package Employee;

public class Main {
    public static void main(String[] args) {
        // Create a SalesStaff object with sample data
        SalesStaff s = new SalesStaff("S", 3, 10000.00);

        // Call getBaseSalary() (but not printing the result)
        // This will not display anything unless we print it
        double salary = s.getBaseSalary();
        System.out.println("Base Salary: " + salary);  // Correct way to show output
    }
}

package Employee;

/**
 * Abstract base class representing a general employee.
 * Provides common attributes and methods that can be inherited by specific employee types.
 */
public abstract class Employee {
    // Employee attributes
    String name;
    int age;
    double baseSalary;

    /**
     * Constructor to initialize an employee's basic information.
     *
     * @param name        Employee's name
     * @param age         Employee's age
     * @param baseSalary  Employee's base monthly salary
     */
    public Employee(String name, int age, double baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    // Setters and getters for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Setters and getters for age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // Setters and getters for base salary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Calculate the employee's salary.
     * Can be overridden in subclasses to include bonuses, commissions, etc.
     *
     * @return base salary by default
     */
    public double calculateSalary() {
        return baseSalary;
    }

    /**
     * Placeholder method that could represent employee rest behavior.
     * To be implemented or overridden if needed.
     */
    void sleep() {}
}

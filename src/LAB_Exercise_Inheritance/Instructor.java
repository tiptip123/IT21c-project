package LAB_Exercise_Inheritance;

public class Instructor extends Person {

    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor: " + getName() + ",Year of Birth:" + getYearOfBirth() + ",Salary:" + salary;
    }   

}
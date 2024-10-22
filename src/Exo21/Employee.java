package Exo21;

public class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee!");
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        work();
        System.out.println("Employee salary: " + getSalary());
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    public void addEmployee() {
        System.out.println("Adding new employee!");
    }

    @Override
    public void displayInfo() {
        work();
        System.out.println("Manager salary: " + getSalary());
    }

    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        employee.displayInfo();

        HRManager manager = new HRManager(70000);
        manager.displayInfo();
        manager.addEmployee();
    }
}
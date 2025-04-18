class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double yearlySalary() {
        return salary * 12;
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", 25000);
        System.out.println("Yearly: " + e.yearlySalary());
    }
}

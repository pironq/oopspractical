class Employee {
    String name;
    double salary;
    static int employeeCount = 0;

    Employee() {
        this("Default Name", 0.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
    
    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice", 75000);
        Employee e3 = new Employee("Bob", 82000);

        e1.display();
        e2.display();
        e3.display();
        
        Employee.displayCount();
    }
}

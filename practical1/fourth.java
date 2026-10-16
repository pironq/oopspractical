class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Employee {
    void calculatePay() {
        System.out.println("Base pay calculation");
    }
}

class FullTimeEmployee extends Employee {
    void calculatePay() {
        System.out.println("Full-time pay: Fixed salary + bonus");
    }
}

class PartTimeEmployee extends Employee {
    void calculatePay() {
        System.out.println("Part-time pay: Hourly rate * hours worked");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("--- Method Overloading ---");
        Calculator calc = new Calculator();
        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(double, double): " + calc.add(5.5, 4.5));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));

        System.out.println("\n--- Method Overriding ---");
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();
        
        emp1.calculatePay();
        emp2.calculatePay();
    }
}

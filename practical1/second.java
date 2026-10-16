class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Person {
    String name = "Alice";
}

class Employee extends Person {
    int id = 101;
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager Name: " + name + ", ID: " + id);
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance ---");
        Car myCar = new Car();
        myCar.start();
        myCar.drive();

        System.out.println("\n--- Multilevel Inheritance ---");
        Manager myManager = new Manager();
        myManager.displayDetails();

        System.out.println("\n--- Hierarchical Inheritance ---");
        Circle myCircle = new Circle();
        myCircle.draw();
        myCircle.drawCircle();
        
        Rectangle myRectangle = new Rectangle();
        myRectangle.draw();
        myRectangle.drawRectangle();
    }
}

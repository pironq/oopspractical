interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}

class Machine {
    void powerOn() {
        System.out.println("Machine powered on.");
    }
}

class SmartDevice extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("SmartDevice printing...");
    }
    public void scan() {
        System.out.println("SmartDevice scanning...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- Multiple Inheritance ---");
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\n--- Hybrid Inheritance ---");
        SmartDevice device = new SmartDevice();
        device.powerOn();
        device.print();
        device.scan();
    }
}

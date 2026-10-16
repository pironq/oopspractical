class Product {
    String name;
    double price;
    int quantity;

    Product() {
        this.name = "Unnamed";
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(String name) {
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: " + price + ", Qty: " + quantity + ", Total: " + totalCost());
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Notebook", 5.50);
        Product p4 = new Product("Laptop", 1200.00, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

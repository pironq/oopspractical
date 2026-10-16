class ComplexNumber {
    double real, imag;

    ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);

        ComplexNumber sum = c1.add(c2);

        System

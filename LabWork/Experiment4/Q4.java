import java.util.Scanner;

class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }
    Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }
    void print() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        System.out.print("Enter real and imaginary part of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.print();
        System.out.print("Difference: ");
        diff.print();
        System.out.print("Product: ");
        prod.print();
        sc.close();
    }
}
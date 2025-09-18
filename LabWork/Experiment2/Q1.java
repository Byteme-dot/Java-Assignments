import java.util.Scanner;

public class Q1 {

    // Function to print a rhombus
    static void printRhombus(char ch, int size) {
        System.out.println("\nRhombus Pattern:");
        for (int i = 0; i < size; i++) {
            for (int space = 0; space < size - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Function to print a left triangle
    static void printLeftTriangle(char ch, int size) {
        System.out.println("\nLeft Triangle Pattern:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Function to print a right triangle
    static void printRightTriangle(char ch, int size) {
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= size; i++) {
            for (int space = 1; space <= size - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Function to print a pyramid
    static void printPyramid(char ch, int size) {
        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= size; i++) {
            for (int space = 1; space <= size - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character to use: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter size of pattern: ");
        int size = sc.nextInt();

        printRhombus(ch, size);
        printLeftTriangle(ch, size);
        printRightTriangle(ch, size);
        printPyramid(ch, size);
    }
}
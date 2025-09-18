import java.util.Scanner;

public class Q1 {
	public static void main(String [] args){
		int a,b,sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		a = scan.nextInt();
		System.out.print("Enter Second Number: ");
		b = scan.nextInt();
        System.out.println("\nSum: "+(a+b)+"\nSubtraction: "+(a-b)+"\nMultiplication: "+(a*b)+"\nDivision: "+(a/b)+"\nReminder: "+(a%b));
    }
}

import java.util.Scanner;

class Multnumbers{
	public static void main(String [] args){
		int a,b,mult;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		b = scan.nextInt();
		mult=a*b;
		System.out.println("Multiplication = "+mult+"\nProgram Ended");
	}
}
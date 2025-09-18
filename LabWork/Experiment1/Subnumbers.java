import java.util.Scanner;

class Subnumbers{
	public static void main(String [] args){
		int a,b,sub;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		b = scan.nextInt();
		sub=a-b;
		System.out.println("Subtraction = "+sub+"\nProgram Ended");
	}
}
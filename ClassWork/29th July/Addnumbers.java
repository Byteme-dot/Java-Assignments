import java.util.Scanner;

class Addnumbers{
	public static void main(String [] args){
		int a,b,sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		b = scan.nextInt();
		sum=a+b;
		System.out.println("Sum = " + sum + "\nProgram End");
	}

}
import java.util.Scanner;

class Remindnumbers{
	public static void main(String [] args){
		int a,b,rem;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		b = scan.nextInt();
		rem=a%b;
		System.out.println("Reminder = "+rem+"\nProgram Ended");
	}
}
import java.util.Scanner;

public class three_digit_sum{
	public static void main(String[] args){
		int input=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sum of 3 digits of 3 digit number");
		System.out.println("Enter 3 digit number: ");
		input=scan.nextInt();
		for(int i=0;i<3;i++){
			sum=sum+(input%10);
			input=input/10;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Program Ended");
	}
}
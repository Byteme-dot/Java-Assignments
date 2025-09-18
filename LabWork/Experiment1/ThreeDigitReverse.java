import java.util.Scanner;

public class ThreeDigitReverse{
	public static void main(String[] args){
		int input=0;
		int reverse=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 3 digit number: ");
		input=scan.nextInt();
		for(int i=0;i<3;i++){
			reverse*=10;
			reverse=reverse+(input%10);
			input=input/10;
		}
		System.out.println("Reversed = "+reverse);
		System.out.println("Program Ended");
	}
}
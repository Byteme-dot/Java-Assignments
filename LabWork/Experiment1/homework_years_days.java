import java.util.Scanner;

public class homework_years_days{
	public static void main(String[] args){
		long input=0;
		long convert=0;
		long days=0;
		long years=0;
		System.out.println("Convert Minutes into years and days");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Minutes: ");
		input=scan.nextInt();
		convert=input/60;
		convert=convert/24;
		days=convert%365;
		years=convert/365;
		System.out.println("Years = "+years+"\nDays = "+days);
		System.out.println("Program Ended");
	}
}
		
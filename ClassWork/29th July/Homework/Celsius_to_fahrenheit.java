import java.util.Scanner;

public class Celsius_to_fahrenheit{
	public static void main(String[] args){
		System.out.println("Convert Celsius to Fahrenheit\n");
		int Cel=0;
		int Fah=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temp. in Celsius: ");
		Cel=scan.nextInt();
		Fah=((Cel*9)/5)+32;
		System.out.println("Temp. in Fahrenheit = "+Fah);
		System.out.println("Program Ended");
	}
}
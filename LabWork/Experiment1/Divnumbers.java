import java.util.Scanner;

class Divnumbers{
	public static void main(String [] args){
		int a,b,div;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		b = scan.nextInt();
        if(b==0){
            System.out.println("Second Number cannot be 0, Enter some other number: ");
            b = scan.nextInt();
        }
		div=a/b;
		System.out.println("Division = "+div+"\nProgram Ended");
	}
}
import java.util.Scanner;

public class mathtables{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		boolean running = true;
		while(running){
			int num;
			System.out.println("Enter Number whose table you want(0 - Exit): ");
			num = scan.nextInt();
			if(num==0){
				running=false;
				break;
			}
			for(int i=1;i<11;i++){
				System.out.println(num+" X "+i+" = "+(num*i));
			}
			System.out.println("\n");
		}
	}
}
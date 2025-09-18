import java.util.*;

public class consonent_or_vowel{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean running=true;
		while(running){
			String input;
			System.out.println("Enter your character (type exit to exit): ");
			input=scan.next();
			switch(input.toLowerCase()){
				case "a":					
				case "e":
				case "i":									
				case "o":					
				case "u":
					System.out.println("It is a vowel!");
					break;
					
				case "exit":
					running = false;
					break;
					
				default:
					System.out.println("It is a consonent!");
					break;
			}
		}
	}
}
		
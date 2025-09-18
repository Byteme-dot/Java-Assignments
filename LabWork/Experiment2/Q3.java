import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter your character (type exit to exit): ");
            String input = scan.next();

            if (input.equalsIgnoreCase("exit")) {
                running = false;
            } else if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Enter a valid single alphabet character!");
            } else {
                char ch = Character.toLowerCase(input.charAt(0));
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("It is a vowel!");
                        break;
                    default:
                        System.out.println("It is a consonant!");
                        break;
                }
            }
        }
    }
}
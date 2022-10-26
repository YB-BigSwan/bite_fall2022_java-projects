import java.util.Scanner;

public class RegexLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		input.close();
		
		System.out.println();
		if (string.matches("[aeiouyäöAEIOUYÄÖ]*$")) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}

	}

}

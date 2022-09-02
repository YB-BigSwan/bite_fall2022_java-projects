import java.util.Scanner;

public class StringCounting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type something here: ");
		String text = input.nextLine();
		
		int stringCount = 0;
		
		while(!text.equals("")) {
			System.out.print("Type something here: ");
			text = input.nextLine();
			stringCount++;
		}

		System.out.println("You entered " + stringCount + " strings.");
	}

}

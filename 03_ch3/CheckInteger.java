import java.util.Scanner;

public class CheckInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String numberText = input.nextLine();

		try {
			int number = Integer.parseInt(numberText);

			System.out.println("OK");
		} catch (NumberFormatException nfe) {

			System.out.println("'" + numberText + "'" + " is not an integer");
		}
	}
}

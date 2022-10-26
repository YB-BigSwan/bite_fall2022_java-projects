import java.util.Scanner;

public class CheckWeekdayNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a weekday number: ");
			int weekday = Integer.parseInt(input.nextLine());
			input.close();

			if (weekday >= 1 && weekday <= 7) {
				System.out.println("OK");
			} else {
				throw new NumberFormatException();
			}

		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer between 1 and 7");
		}
		
	}
}

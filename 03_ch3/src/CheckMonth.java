import java.util.Scanner;

public class CheckMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String output = "";

		while (!output.equals("OK")) {
			System.out.print("Enter a month number: ");
			String month = input.nextLine();

			try {
				int monthNo = Integer.parseInt(month);

				if (monthNo >= 1 && monthNo <= 12) {
					output = ("OK");
					System.out.println(output);
				} else {
					throw new NumberFormatException();
				}

			} catch (NumberFormatException nfe) {
				output = month + " is not a valid month number.";
				System.out.println(output);
				System.out.println("");
				input.close();
			}
		}
	}
}

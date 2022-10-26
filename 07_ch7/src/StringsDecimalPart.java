import java.util.Scanner;

public class StringsDecimalPart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		String deciNumber = input.nextLine().replace('.', ',');
		input.close();

		String[] deciPlaces = deciNumber.split(",");
		System.out.println();

		try {
			int deciLength = deciPlaces[1].length();

			if (deciLength >= 1 && deciNumber.matches("^[0-9]{1,},{1}[0-9]*$")) {
				System.out.println(deciLength + " decimal place(s)");
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Please enter a proper decimal number");
		}

	}

}

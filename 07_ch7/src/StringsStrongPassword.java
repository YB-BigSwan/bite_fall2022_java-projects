import java.util.Scanner;

public class StringsStrongPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();
		input.close();

		System.out.println();

		if (checkStrength(password) == true) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}

	}

	public static boolean checkStrength(String password) {
		int upper = 0;
		int lower = 0;
		int number = 0;
		int character = 0;
		int count = 0;

		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {

				if (Character.isUpperCase(password.charAt(i))) {
					upper++;
				} else if (Character.isLowerCase(password.charAt(i))) {
					lower++;
				} else if (Character.isDigit(password.charAt(i))) {
					number++;
				} else {
					character++;
				}

			}

			if (upper > 0) {
				count++;
			}
			if (lower > 0) {
				count++;
			}
			if (number > 0) {
				count++;
			}
			if (character > 0) {
				count++;
			}
			
		}

		if (count >= 3) {
			return true;
		} else {
			return false;
		}
	}
}

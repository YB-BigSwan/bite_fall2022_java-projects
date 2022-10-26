import java.util.Scanner;

public class MethodsNonPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = Integer.parseInt(input.nextLine());
		input.close();

		String output = "";

		if (number < 4) {
			System.out.print("Nothing to be printed");
		} else {
			for (int i = 4; i < number; i++) {
				if (!isPrime(i)) {
					output += i + " ";
				}
			}
		}

		System.out.println(output);
		;

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}

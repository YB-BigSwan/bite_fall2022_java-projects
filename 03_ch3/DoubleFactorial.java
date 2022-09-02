import java.util.Scanner;

public class DoubleFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a non-negative integer: ");
		String num = input.nextLine();

		try {
			int number = Integer.parseInt(num);

			if (number >= 0) {
				System.out.println(number + "!! = " + doublefactorial(number));
			} else {
				throw new NumberFormatException();
			}

		} catch (NumberFormatException nfe) {

			System.out.println("Please enter a non-negative integer.");
		}

	}

	public static int doublefactorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		} else {
			return number * doublefactorial(number - 2);
		}
	}

}

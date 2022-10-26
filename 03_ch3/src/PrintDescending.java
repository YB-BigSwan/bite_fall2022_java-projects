import java.util.Scanner;

public class PrintDescending {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = Integer.parseInt(input.nextLine());
		int total = 0;

		while (number >= 1) {
			System.out.print(number + " ");
			total = total + number;
			number--;

		}

		String output;

		if (total == 0) {
			output = "Nothing to be printed";
		} else {
			output = "The sum is " + total;
		}

		System.out.println("");

		System.out.println(output);
		input.close();
	}

}

import java.util.Scanner;

public class MethodsFirst {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = Integer.parseInt(input.nextLine());

		printPowers(number);
		input.close();
	}

	public static int printPowers(int number) {
		int output = 1;

		for (int i = 0; i < 20; i++) {
			System.out.print(output + " ");
			output = output * number;
		}

		return output;
	}
}

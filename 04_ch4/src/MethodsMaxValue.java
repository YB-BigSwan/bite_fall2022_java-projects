import java.util.Scanner;

public class MethodsMaxValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		Double numOne = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter second number: ");
		Double numTwo = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter third number: ");
		Double numThree = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println();
		System.out.println("The largest value is " + maxValue(numOne, numTwo, numThree));
		input.close();

	}

	public static double maxValue(double numOne, double numTwo, double numThree) {
		Double output = 0.0;

		if (numOne > output) {
			output = numOne;
		} else {
			output = output;
		}

		if (numTwo > output) {
			output = numTwo;
		} else {
			output = output;
		}

		if (numThree > output) {
			output = numThree;
		} else {
			output = output;
		}

		return output;
	}

}

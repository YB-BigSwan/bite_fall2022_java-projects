import java.util.Scanner;

public class MethodsMathProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		Double numOne = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter second number: ");
		Double numTwo = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter third number: ");
		Double numThree = Double.parseDouble(input.nextLine().replace(',', '.'));

		input.close();

		System.out.println();
		System.out.println("The largest value is " + MethodsMath.maxValue(numOne, numTwo, numThree));
	}

}

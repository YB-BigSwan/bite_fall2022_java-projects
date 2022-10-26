import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// scanner and decimal formatting
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		// first value
		System.out.print("Enter first number: ");
		Double firstValue = Double.parseDouble(input.nextLine().replace(',', '.'));

		// counter and total
		Double nextValue = firstValue;
		int count = 0;
		Double total = 0.0;

		// While loop
		while (nextValue != 0) {
			total += nextValue;
			System.out.print("Enter next number: ");
			nextValue = Double.parseDouble(input.nextLine().replace(',', '.'));
			count++;
		}

		// calculate for average
		Double avg = total / count;

		// output
		String output;

		if (avg > 0) {
			output = "The average is " + twoDecimal.format(avg);
		} else {
			output = "Nothing to be calculated";
		}

		System.out.println(output);
		input.close();

	}

}

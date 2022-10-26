import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysSampleAnalysis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		
		System.out.print("Enter the number of values: ");
		int aLength = Integer.parseInt(input.nextLine());
		
		int[] numbers = new int[aLength];
		
		if (aLength < 4) {
			System.out.println("Sorry, at least 4 values required");
		} else {
			for (int i = 0; i < numbers.length; i++) {
				System.out.print("Enter an integer: ");
				numbers[i] = Integer.parseInt(input.nextLine());
			}
			input.close();
			
			
			System.out.println();
			System.out.println("n = " + aLength);
			System.out.println("Min: " + ArraysSampleLibrary.min(numbers));
			System.out.println("Max: " + ArraysSampleLibrary.max(numbers));
			System.out.println("Mean: " + oneDecimal.format(ArraysSampleLibrary.mean(numbers)));
			System.out.println("Median: " + oneDecimal.format(ArraysSampleLibrary.median(numbers)));
			System.out.println("Sample standard deviation: " + oneDecimal.format(ArraysSampleLibrary.standardDeviation(numbers)));
			System.out.print("Sample data: " + Arrays.toString(numbers).replace(",", "").replace("[", "").replace("]", " "));
		}	

	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class GenderDistribution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		System.out.print("Enter the number of female students: ");
		Double female = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the number of male students: ");
		Double male = Double.parseDouble(input.nextLine().replace(',', '.'));

		Double femaleTotal = female / (female + male) * 100;
		Double maleTotal = male / (female + male) * 100;

		System.out.println("");

		System.out.println("Female: " + oneDecimal.format(femaleTotal) + " %");
		System.out.println("Male: " + oneDecimal.format(maleTotal) + " %");
		input.close();

	}

}

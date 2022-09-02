import java.text.DecimalFormat;
import java.util.Scanner;

public class GymExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Enter the number of days of gym visits per year: ");
		int gymVisits = Integer.parseInt(input.nextLine());

		System.out.print("Enter price for a day pass: ");
		Double dayPassFee = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter yearly membership fee: ");
		Double yearMembership = Double.parseDouble(input.nextLine().replace(',', '.'));

		Double dayPassCost = gymVisits * dayPassFee;

		String output;

		if (yearMembership < dayPassCost) {
			Double difference = dayPassCost - yearMembership;
			output = "Paying the yearly membership fee is " + twoDecimal.format(difference) + " euros cheaper";
		} else if (yearMembership > dayPassCost) {
			Double difference = yearMembership - dayPassCost;
			output = "Buying day passes is " + twoDecimal.format(difference) + " euros cheaper";
		} else {
			output = "There is no price difference";
		}

		System.out.println("");

		System.out.println(output);
	}

}

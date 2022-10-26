import java.text.DecimalFormat;
import java.util.Scanner;

public class GuitarStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Number of gigs: ");
		int gigs = Integer.parseInt(input.nextLine().replace(',', '.'));

		System.out.print("Gigs to be played with the same set of strings: ");
		int gigsOnStrings = Integer.parseInt(input.nextLine().replace(',', '.'));

		System.out.print("Price of a set of guitar strings: ");
		Double stringPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		int remainder = gigs % gigsOnStrings;
		int setsOfStrings = gigs / gigsOnStrings;

		if (remainder >= 1) {
			setsOfStrings++;
		}

		Double totalCost = setsOfStrings * stringPrice;

		System.out.println("");

		System.out.println("The guitarist needs " + setsOfStrings + " new sets of guitar strings");
		System.out.println("The total cost is " + twoDecimal.format(totalCost) + " euros");
		input.close();
	}

}

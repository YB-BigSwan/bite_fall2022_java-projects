import java.text.DecimalFormat;
import java.util.Scanner;

public class RenovationExpenses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Total area to be painted (square meters): ");
		Double areaToPaint = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Paint coverage (square meters): ");
		Double paintCoverage = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Paint price per liter (euros): ");
		Double ppLiter = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Number of people: ");
		int people = Integer.parseInt(input.nextLine().replace(',', '.'));

		Double cansNeeded = Math.ceil(areaToPaint / paintCoverage);
		Double totalPrice = cansNeeded * ppLiter;
		Double pricePerPerson = totalPrice / people;

		System.out.println("");

		System.out.println(
				"Each of the " + people + " people should pay " + twoDecimal.format(pricePerPerson) + " euros.");
	}

}

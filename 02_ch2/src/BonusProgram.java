import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Enter the boat's selling price: ");
		Double boatPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		Double bonus;

		if (boatPrice <= 50000) {
			bonus = boatPrice * 0.01;
		} else {
			bonus = boatPrice * 0.015;
		}

		if (bonus <= 200) {
			bonus = 200.00;
		}

		System.out.println("");

		System.out.println("The bonus is " + twoDecimal.format(bonus) + " euros.");
		input.close();
	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		// variables
		System.out.print("Enter initial deposit: ");
		Double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());

		System.out.print("Enter interest rate: ");
		Double interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter capital income tax rate: ");
		Double incomeTax = Double.parseDouble(input.nextLine().replace(',', '.'));

		Double balance = deposit;

		System.out.println();

		// calculate interest
		for (int i = 1; i < years + 1; i++) {
			Double yearInterest = (balance * (interestRate / 100));
			Double taxedInterest = yearInterest - (yearInterest * (incomeTax / 100));
			balance = balance + taxedInterest;
			System.out.println("Year " + i + ": " + twoDecimal.format(balance));
		}
		input.close();
	}

}

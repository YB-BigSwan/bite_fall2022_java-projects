import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Enter price: ");
		Double price = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter discount percentage: ");
		Double discount = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println("");
		System.out.print("The discount is " + twoDecimal.format(computeDiscount(price, discount)) + " euros");

	}

	public static double computeDiscount(double price, double discount) {
		Double discountedPrice = price - (price * (discount / 100));
		return discountedPrice;
	}

}

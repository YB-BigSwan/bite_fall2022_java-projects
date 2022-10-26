import java.math.BigDecimal;
import java.util.Scanner;

public class AccurateArithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		BigDecimal firstNo = new BigDecimal(input.nextLine());

		System.out.print("Enter second number: ");
		BigDecimal secondNo = new BigDecimal(input.nextLine());

		BigDecimal total = firstNo.add(secondNo);

		System.out.println("");

		System.out.println(firstNo + " + " + secondNo + " = " + total);
		input.close();

	}

}

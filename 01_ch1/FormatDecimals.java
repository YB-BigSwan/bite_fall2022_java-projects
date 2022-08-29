package week_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatDecimals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat oneDecimal = new DecimalFormat("0.00");
		DecimalFormat twoDecimal = new DecimalFormat("0.0000");
		
		System.out.print("Enter a decimal number: ");
		double deciNumber = Double.parseDouble(input.nextLine().replace(',','.'));
		
		
		System.out.println("");
		
		
		System.out.println(oneDecimal.format(deciNumber));
		System.out.println(twoDecimal.format(deciNumber));

	}

}

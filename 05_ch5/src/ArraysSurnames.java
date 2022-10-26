import java.util.Arrays;
import java.util.Scanner;

public class ArraysSurnames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of surnames: ");
		int aLength = Integer.parseInt(input.nextLine());

		String[] surnames = new String[aLength];

		for (int i = 0; i < aLength; i++) {
			System.out.print("Enter a surname: ");
			surnames[i] = input.nextLine();
		}
		input.close();
		Arrays.sort(surnames);

		String output = "";
		for (int i = 0; i < surnames.length; i++) {
			if (!output.contains(surnames[i])) {
				output += surnames[i] + " ";
			}
		}

		System.out.println(output);
	}

}

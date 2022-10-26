import java.util.Scanner;

public class StringsSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.nextLine();
		input.close();

		System.out.println('"' + removeExtraSpace(string) + '"');

	}

	private static String removeExtraSpace(String string) {
		String newString = string.replaceAll("( )+", " ");
		return newString;
	}

}

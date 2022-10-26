import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = input.nextLine();

		System.out.print("Enter second string: ");
		String str2 = input.nextLine();

		String output;

		if (str1.equals(str2)) {
			output = "The strings are equal";
		} else {
			output = "The strings are not equal";
		}

		System.out.println("");
		System.out.println(output);
		input.close();
	}

}
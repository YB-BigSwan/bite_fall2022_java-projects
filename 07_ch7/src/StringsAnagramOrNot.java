import java.util.Arrays;
import java.util.Scanner;

public class StringsAnagramOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String firstString = input.nextLine();

		System.out.print("Enter second string: ");
		String secondString = input.nextLine();
		input.close();

		System.out.println();
		if (isAnagram(firstString, secondString) == true) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram");
		}
	}

	public static boolean isAnagram(String firstString, String secondString) {
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();

		char[] oneS = firstString.toCharArray();
		char[] twoS = secondString.toCharArray();

		Arrays.sort(oneS);
		Arrays.sort(twoS);

		String one = Arrays.toString(oneS).replaceAll("[ ,.;]", "").replace("[", "").replace("]", "");
		String two = Arrays.toString(twoS).replaceAll("[ ,.;]", "").replace("[", "").replace("]", "");

		if (one.equals(two) && one.matches("[a-zåäö]{1,}")) {
			return true;
		} else {
			return false;
		}
	}
}

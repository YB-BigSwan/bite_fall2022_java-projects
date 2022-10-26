import java.util.Arrays;
import java.util.Scanner;

public class StringsPalindromeSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String words = input.nextLine();
		input.close();

		if (isPalindrome(words) == true) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("No palindrome");
		}
	}

	public static boolean isPalindrome(String words) {

		words = words.toLowerCase();

		char[] stringArray = words.toCharArray();
		char[] stringCopy = Arrays.copyOf(stringArray, stringArray.length);

		for (int i = 0; i < stringArray.length; i++) {
			stringCopy[i] = stringArray[stringArray.length - (i + 1)];
		}

		String one = Arrays.toString(stringArray).replaceAll("[ ,.;?!\'\"-]", "").replace("[", "").replace("]", "");
		String two = Arrays.toString(stringCopy).replaceAll("[ ,.;?!\'\"-]", "").replace("[", "").replace("]", "");

		if (one.equals(two) && one.matches("[a-zåäö]{1,}")) {
			return true;
		} else {
			return false;
		}
	}
}

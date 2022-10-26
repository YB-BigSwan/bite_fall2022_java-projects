import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		input.close();
		
		int letters = 0;
		int digits = 0;
		int otherChar = 0;
		
		for (int i = 0;  i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				letters++;
			} else if (Character.isDigit(string.charAt(i))) {
				digits++;
			} else {
				otherChar++;
			}
		}
		
		System.out.println();
		System.out.println(letters + " letter(s)");
		System.out.println(digits + " digit(s)");
		System.out.println(otherChar + " other character(s)");
		
	}

}

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();
		input.close();
		
		System.out.println();
		if (checkStrength(username, password) == true) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}

	public static boolean checkStrength(String username, String password) {
		password.toLowerCase();
		if (password.length() >= 9 && !password.contains(username.toLowerCase())) {
			return true;
		} else {
			return false;
		}
		
	}

}

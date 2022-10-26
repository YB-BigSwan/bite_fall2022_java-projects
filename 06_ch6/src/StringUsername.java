import java.util.Scanner;

public class StringUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter given name: ");
		String name = input.nextLine();
		
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		input.close();
		
		System.out.println(createUsername(name, surname));

	}
	
	public static String createUsername(String name, String surname) {
		String output;
		
		if (name.length() < 5 || surname.length() < 5) {
			output = "Not enough letters to create a username!";
		} else {
			
			output = surname.substring(surname.length() - 3, surname.length()).toLowerCase() + name.substring(0,2).toLowerCase();
		}
		
		return output;
	}

}

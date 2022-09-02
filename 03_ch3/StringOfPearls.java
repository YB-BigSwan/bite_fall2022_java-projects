import java.util.Scanner;

public class StringOfPearls {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String fString = input.nextLine();
		int counter = 0;
		String nString = fString;
		
		while (!nString.equals("quit")) {
			if (nString.equalsIgnoreCase("pearl")) {
			counter ++;
			System.out.print("Enter next string: ");
			nString = input.nextLine();
		} else {
			System.out.print("Enter next string: ");
			nString = input.nextLine();
		}	
		}
		
		String output;
		
		if (fString.equals("quit")) {
			output = "Bye!";
			
		} else {
			output = counter + " pearl(s) \nBye!";
		}

		System.out.println("");
		System.out.println(output);
	}

}

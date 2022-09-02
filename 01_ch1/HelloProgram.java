package week_01;

import java.util.Scanner;

public class HelloProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter greeting word: ");
		String greetingWord = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.println("");

		System.out.println(greetingWord + " " + firstName + " " + lastName + "!");
	}

}

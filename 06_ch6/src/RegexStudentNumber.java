import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNo = input.nextLine();
		input.close();

		System.out.println();
		if (studentNo.matches("2.*$") && studentNo.length() == 8) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
		}
	}
}

import java.util.Scanner;

public class RegexSize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter size: ");
		String size = input.nextLine();
		input.close();

		System.out.println();
		if (size.matches("XX[SL]|X[SL]|[SML]")) {
			System.out.println("Size ok");
		} else {
			System.out.println("Invalid size");
		}

	}

}

import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		String string = input.nextLine();

		System.out.print("Enter count: ");
		int count = Integer.parseInt(input.nextLine());

		System.out.println("");

		multiPrint(string, count);
		input.close();
	}

	public static void multiPrint(String string, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(string + " ");
		}
	}
}

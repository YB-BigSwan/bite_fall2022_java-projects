import java.util.Scanner;

public class SharingApples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many apples? ");
		int apples = Integer.parseInt(input.nextLine());

		System.out.print("How many children? ");
		int children = Integer.parseInt(input.nextLine());

		int applesPerChild = apples / children;
		int remainder = apples % children;

		System.out.println("");

		System.out.println("Each child will get " + applesPerChild + " apples.");
		System.out.println("There will be " + remainder + " leftover apples.");
		input.close();
	}

}

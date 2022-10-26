import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] intArray = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an integer: ");
			intArray[i] = Integer.parseInt(input.nextLine());
		}
		
		input.close();

		for (int i = 0; i < 5; i++) {
			intArray[i] = intArray[i] * -1;
			Arrays.sort(intArray);
		}

		for (int i = 0; i < 5; i++) {
			intArray[i] = intArray[i] * -1;
			System.out.print(intArray[i] + " ");
		}

	}

}

import java.util.Scanner;

public class ArraysWords {

	public static void main(String[] args) {
		String[] english = { "bus", "car", "cat", "horse", "moon", "sun", "thanks", "train", "teacher" };
		String[] finnish = { "bussi", "auto", "kissa", "hevonen", "kuu", "auriko", "kiitos", "juna", "opettaja" };

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String word = input.nextLine();
		input.close();

		boolean translate = false;

		System.out.println();

		for (int i = 0; i < english.length; i++) {
			if (word.equalsIgnoreCase(english[i])) {
				translate = true;
				System.out.println(finnish[i]);
			}
		}

		if (translate == false) {
			System.out.println("Unknown word");
		}

	}

}

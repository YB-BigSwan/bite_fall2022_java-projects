import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsSortWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> transArray = new ArrayList<WordPair>();

		String eWord = "";
		String fWord = "";

		while (!eWord.equalsIgnoreCase("quit")) {
			System.out.print("Enter an English word (quit ends): ");
			eWord = input.nextLine();

			if (!eWord.equalsIgnoreCase("quit")) {
				System.out.print("Enter a Finnish word: ");
				fWord = input.nextLine();
				System.out.println();

				WordPair wp = new WordPair(eWord, fWord);
				transArray.add(wp);
			}
		}
		input.close();
		System.out.println();

		Collections.sort(transArray);
		for (int i = 0; i < transArray.size(); i++) {
			transArray.get(i).setIsTrue(false);
			System.out.println(transArray.get(i));
		}

		System.out.println();

		for (int i = 0; i < transArray.size(); i++) {
			transArray.get(i).setIsTrue(true);
		}

		Collections.sort(transArray);
		for (int i = 0; i < transArray.size(); i++) {
			System.out.println(transArray.get(i));
		}

	}

}

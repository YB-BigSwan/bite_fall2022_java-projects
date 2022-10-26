import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> transArray = new ArrayList<WordPair>();

		String eWord = "";
		String fWord = "";

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		while (!eWord.equalsIgnoreCase("ok")) {
			System.out.print("Enter an English word: ");
			eWord = input.nextLine();

			if (!eWord.equalsIgnoreCase("ok")) {
				System.out.print("Enter a Finnish word: ");
				fWord = input.nextLine();
				System.out.println();

				WordPair wp = new WordPair(eWord, fWord);
				transArray.add(wp);
			}
		}
		System.out.println();

		
		System.out.println("=== English-Finnish translation service (quit ends) ===");
		while (!eWord.equalsIgnoreCase("quit")) {
			String output = "";
			System.out.print("Enter an English word: ");
			eWord = input.nextLine();

			for (int i = 0; i < transArray.size(); i++) {
				if (transArray.get(i).getEnglishWord().equalsIgnoreCase(eWord)) {
					output = transArray.get(i).getFinnishWord();
				}
			}
			if(!eWord.equalsIgnoreCase("quit")) {
				if (output == "") {
					System.out.println("Unknown word");
				} else {
					System.out.println(output);
				}
			}
			

		}
		System.out.println("Bye!");
		input.close();
	}
}

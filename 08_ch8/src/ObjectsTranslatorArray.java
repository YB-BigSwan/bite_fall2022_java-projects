import java.util.Scanner;

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		WordPair[] transArray = {
			new WordPair("bird", "lintu"),
			new WordPair("bar", "baari"),
			new WordPair("bus","bussi"),
			new WordPair("car", "auto"),
			new WordPair("cat", "kissa"),
			new WordPair("dog", "koira")
		};
		
		System.out.print("Enter an English word: ");
		String eWord = input.nextLine();
		input.close();
		String output = "";
		
		System.out.println();
		for (int i = 0; i < transArray.length; i++) {
			if (transArray[i].getEnglishWord().equalsIgnoreCase(eWord)) {
				output = transArray[i].getFinnishWord();
			} 
		}
		
		if (output == "") {
			System.out.println("Unknown word");
		} else {
			System.out.println(output);
		}

	}
}

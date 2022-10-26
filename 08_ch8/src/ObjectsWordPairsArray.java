
public class ObjectsWordPairsArray {

	public static void main(String[] args) {
		WordPair[] wordArray = {
				new WordPair("school", "koulu"),
				new WordPair("student", "opiskelija"),
				new WordPair("textbook", "oppikirja")
		};
		
		for (int i = 0; i < wordArray.length; i++) {
			System.out.println(wordArray[i].toString());
		}

	}

}

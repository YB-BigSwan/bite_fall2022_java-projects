
public class WordPair implements Comparable<WordPair> {

	private String englishWord;
	private String finnishWord;
	private boolean langSwitch;

	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public String getFinnishWord() {
		return finnishWord;
	}

	public void setIsTrue(boolean langSwitch) {
		this.langSwitch = langSwitch;
	}

	public boolean getIsTrue() {
		return langSwitch;
	}

	public int compareTo(WordPair anotherWordPair) {
		if (langSwitch == false) {
			return this.getEnglishWord().compareTo(anotherWordPair.getEnglishWord());
		} else {
			return this.getFinnishWord().compareTo(anotherWordPair.getFinnishWord());
		}

	}

	public String toString() {
		if (langSwitch == false) {
			return englishWord + " = " + finnishWord;
		} else {
			return finnishWord + " = " + englishWord;
		}
	}
}

public class MagicWord {
	
	private static final String[] WORDS = {"theatre","capital",
			"cinema", "parachute", "traveller"};
	private boolean[] guessed;
	private String hiddenWord;
	
	public MagicWord() {
		int numAlea = (int) (Math.random() * WORDS.length);
		hiddenWord = WORDS[numAlea];
		guessed = new boolean[hiddenWord.length()];
		for (int i=0; i<guessed.length; i++) {
			guessed[i] = false;
		}	
		System.out.println(hiddenWord);
	}
	
	
	@Override
	public String toString() {	
		String s = "";
		for(int i=0; i < guessed.length; i++) {
			if (guessed[i]) {
				s = s + hiddenWord.charAt(i) + " ";				
			} else {
				s = s + "_ ";
			}
		}
		return s;
	}
	
	public void checkAnswer(String ans) {
		ans = ans.toLowerCase();
		if (ans.length() == 1) {
			checkLetter(ans.charAt(0));
		} else {
			checkWord(ans);
		} 
	}
	
	private void checkLetter(char c) {
		for(int i = 0; i < hiddenWord.length(); i++) {
			if (c == hiddenWord.charAt(i)) {
				guessed[i] = true;
			} 
		}
	}
	
	
	private void checkWord(String word) {
		if (word.equals(hiddenWord)) {
			putAllGuessedToTrue();
		}
	}


	private void putAllGuessedToTrue() {
		for (int i = 0; i < guessed.length; i++) {
			guessed[i] = true;
		}
		
	}
	
	public boolean isWinner() {
		int i = 0;
		while (i< guessed.length && guessed[i]) {
			i++;
		}
		if (i<guessed.length) {
			return false;
		} else {
			return true;
		}
	}
	
	

}










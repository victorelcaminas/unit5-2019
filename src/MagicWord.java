
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
	}
	
	
	
	
	

}

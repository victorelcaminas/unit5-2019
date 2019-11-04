
public class Dni {
	
	public static final char[] LETTERS = {'T','R','W','A','G',
			'M','Y','F','P','D','X','B','N','J','Z','S',
			'Q','V','H','L','C','K','E'};
	
	private int number;
	private char letter;
	
	public Dni() {
		number = 0;
		letter = LETTERS[0];
	}
	
	public Dni(int number) {
		this.number = number;
		letter = LETTERS[number % 23];
	}
	
	public Dni(int number, char letter) {
		this.number = number;
		this.letter = letter;
		checkLetter();
	}
	
	public Dni(String s) {
		letter = s.charAt(s.length() -1 );
		number = Integer.parseInt(s.replaceAll("[^\\d]", ""));
		checkLetter();
	}
	
	public int getNumber() {
		return number;
	}
	
	public char getLetter() {
		return letter;
	}
	
	public void setNumber(int number) {
		this.number = number;
		checkLetter();
	}
	
	private void checkLetter( ) {
		if (number >= 0 ) {
			if (LETTERS[number % 23] != letter) {
				number = -number;
			}
		} else {
			if (LETTERS[-number % 23] == letter) {
				number = -number;
			}
		}
		
	}
	
	public boolean isCorrect() {
		if (number >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "" + number + letter;
	}
	
	public String toFormattedString() {
		StringBuilder s = new StringBuilder(String.valueOf(number));
		if (number>999) {
			s.insert(s.length()-3,'.');
		}
		if (number>999999) {
			s.insert(s.length()-7,'.');
		}
		if (number>999999999) {
			s.insert(s.length()-11,'.');
		}
		return s.toString()+"-"+letter;
	}
	
	public static char letterForDni(int number) {
		return LETTERS[number % 23];
	}
	
	public static String NifForDni(int number) {
		
		return new Dni(number).toString();
		
		
	}
	
}












public class TestBook {

	public static void main(String[] args) {
		
		Author a = new Author("Richard Rothfuss", "richardr@gmail.com",
				'm');
		Book b = new Book("The name of the wind", a, 30.9, 10);
		Book b2 = new Book("The notebook",
					new Author("Patrick Smith", "ppp@gmail.com", 'm'),
					25.9);
		Book b3 = new Book("The fear of a wise man", a, 35.9, 8);
		Book b4 = b;
		

	}

}

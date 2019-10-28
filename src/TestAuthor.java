
public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Richard Rothfuss", "richardr@gmail.com",
				'm');
		System.out.println(a.toString());
		a.setEmail("rrrrr@gmail.com");
		System.out.println(a.toString());
	}

}

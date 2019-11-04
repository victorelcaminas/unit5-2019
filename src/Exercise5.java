
public class Exercise5 {

	public static void main(String[] args) {
		
		Switchboard sb = new Switchboard(20);
		sb.registerCall(new Call(111, 333, 15, 1, false));
		sb.registerCall(new Call(222, 444, 10, 1, false));
		sb.registerCall(new Call(555, 666, 12, 2, false));
		sb.print();
		System.out.println("------");
		sb.print(1);
		
		System.out.println("Num calls: " + sb.getNumRegisteredCalls());
		System.out.println("Turnover: " + sb.getTurnover());
	}

}

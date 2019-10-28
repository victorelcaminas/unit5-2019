
public class MainClass5 {

	public static void main(String[] args) {
		
		Point[] arrayP;
		arrayP = new Point[10];
		for(int i = 0; i < arrayP.length; i++) {
			arrayP[i] = new Point(i, i);			
		}
		
		for(Point p: arrayP) {
			System.out.println(p);
		}
		
		Rectangle[] arrayR;
		arrayR = new Rectangle[10];
		for(int i = 0; i < arrayR.length; i++) {
			arrayR[i] = new Rectangle(arrayP[i], 1, 1);				
		}
		for (Rectangle r: arrayR) {
			System.out.println(r);
		}

	}

}


public class Polygon {

	private Point[] points;
	
	public Polygon(Point[] points) {
		this.points = points;
	}
	
	public Polygon() {
		points = new Point[0];
	}
	
	@Override 
	public String toString() {
		String s = "";
		for(int i = 0; i < points.length; i++) {			
			s += points[i].toString() + "-";
		}
		s += points[0];
		return s;
	}
	
	public void setOffset(int offX, int offY) {
		
	}
}

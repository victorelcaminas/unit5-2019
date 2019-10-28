
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
		for (int i = 0; i < points.length; i++) {
			points[i].setOffset(offX, offY);
		}
	}
	
	public double getLength() {
		double length = 0;
		for (int i = 1; i < points.length; i++) {
			Point p1 = points[i];
			Point p2 = points[i - 1];
			Segment s = new Segment(p1, p2);
			length += s.module();
		}
		Point lastPoint = points[points.length - 1];
		Point firstPoint = points[0];
		Segment s = new Segment(lastPoint, firstPoint);
		length += s.module();
		return length;
	}
}








public class Triangle {
	
	private Point v1;
	private Point v2;
	private Point v3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		v1 = p1;
		v2 = p2;
		v3 = p3;
	}
	
	@Override
	public String toString() {
		return "Triangle @ " + v1 + ", " + v2 + ", " + v3;
	}
	
	public double perimeter() {
		return Point.distance(v1, v2) + Point.distance(v2, v3) +
				Point.distance(v3, v1);
	}
	
	public void printType() {
		double d1 = Point.distance(v1, v2);
		double d2 = Point.distance(v2, v3);
		double d3 = Point.distance(v3, v1);
		
		if (d1 == d2 && d2 == d3) {
			System.out.println("Equilateral");
		} else {
			if (d1 != d2 && d1 != d3 && d2 != d3) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}
		}
	}
	
}

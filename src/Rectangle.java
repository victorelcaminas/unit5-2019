import org.w3c.dom.css.Rect;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		width = 0;
		height = 0;
	}
	
	public Rectangle(Point p, int width, int height) {
		super(p.getX(), p.getY());
		this.width = width;
		this.height = height;		
	}
	
	public Rectangle(Point p1, Point p2) {
		super(p1.getX(), p1.getY());
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY(); 
	}
	
	public Rectangle(Segment segment) {
		super(segment.getStartPoint().getX(), 
			  segment.getStartPoint().getY());
		Point p1 = segment.getStartPoint();
		Point p2 = segment.getEndPoint();
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return super.toString() + " width: " + width + 
				"  height: " + height;
	}
	
	public Point getPoint() {
		return new Point(getX(), getY());
	}
	
	public Point getBottomLeftPoint() {
		return getPoint();
	}
	
	public Point getBottomRightPoint() {
		return new Point(getX() + width , getY());
	}
	
	public Point getTopLeftPoint() {
		return new Point(getX(), getY() + height);
	}
	
	public Point getTopRightPoint() {
		return new Point(getX() + width ,
						getY() + height);
	}

}













public class Segment {
	
	private Point startPoint;
	private Point endPoint;
	
	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public Segment() {
		startPoint = new Point();
		endPoint = new Point();
	}
	
	public Segment(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	
	public double module() {
		int c1 = endPoint.getX() - startPoint.getX();
		int c2 = endPoint.getY() - startPoint.getY();
		double distance = Math.sqrt(c1 * c1 + c2 * c2);
		return distance;
	}
	
	@Override
	public String toString() {
		return startPoint.toString() + " - " + endPoint.toString();
	}
	
	public void setOffset(int offX, int offY) {		
		startPoint.setOffset(offX, offY);
		endPoint.setOffset(offX, offY); 
	}
	

}

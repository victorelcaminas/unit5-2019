
public class Call {
	
	private int numSource;
	private int numDestination;
	private int seconds;
	private int band;
	private boolean local;
	private double cost;
	
	public static final double LOCAL_COST = 0.15;
	public static final double BAND_1_COST = 0.20;
	public static final double BAND_2_COST = 0.25;
	public static final double BAND_3_COST = 0.30;
	
	public Call(int numSource, int numDestination, int seconds, int band, boolean local) {
		this.numSource = numSource;
		this.numDestination = numDestination;
		this.seconds = seconds;
		this.band = band;
		this.local = local;
		cost = calculateCost();
	}
	
	public double getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		return "N. source: " + numSource + "  N. dest.: " +
				numDestination + "  Seconds: " + seconds + 
				"  Band: " + band;
	}
	
	private double calculateCost() {
		if (local) {
			return seconds * LOCAL_COST;
		} else {
			switch (band) {
			case 1: return seconds * BAND_1_COST;
			case 2: return seconds * BAND_2_COST;	
			case 3: return seconds * BAND_3_COST;	
			default:
				return -1;
			}
		}
		
	}

}

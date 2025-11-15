package lap3_3;

public class TemperatureRange {
	private int low;
	private int hight;
	public TemperatureRange(int low, int hight) {
		super();
		this.low = low;
		this.hight = hight;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public boolean within(TemperatureRange that) {
		return (this.getLow() >= that.getLow()) && 
				    (this.getHight() <= that.getHight());
	}
	
}

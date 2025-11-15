package lap3_3;

public class WeatherRecord {
	private Date d;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;
	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
			double precipitation) {
		super();
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
	
	
	public double getPrecipitation() {
		return precipitation;
	}


	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}


	public TemperatureRange getToday() {
		return today;
	}

	public void setToday(TemperatureRange today) {
		this.today = today;
	}

	public TemperatureRange getNormal() {
		return normal;
	}

	public void setNormal(TemperatureRange normal) {
		this.normal = normal;
	}

	public boolean withinRange() {
		return this.getToday().within(this.getNormal());
	}
	public boolean rainyDay(double thatPrecipitation) {
		return this.getPrecipitation() >= thatPrecipitation ; 
	}
	public boolean recordDay() {
		return !this.today.within(record);
	}

}

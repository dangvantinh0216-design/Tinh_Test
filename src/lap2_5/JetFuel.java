package lap2_5;

public class JetFuel {
	private int quantitySold;
	private String qualityLevel;
	private int basePrice;
	public JetFuel(int quantitySold, String qualityLevel, int basePrice) {
		super();
		this.quantitySold = quantitySold;
		this.qualityLevel = qualityLevel;
		this.basePrice = basePrice;
	}
	
	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public String getQualityLevel() {
		return qualityLevel;
	}

	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public int totalCost() {
		return this.basePrice * this.quantitySold ;
	}
	public double discountPrice () {
		double total = totalCost() ;
		double discount = 0 ;
		if (this.quantitySold > 100000) {
		 discount = 0.10;
		}return total - (total * discount) ;
	}

}

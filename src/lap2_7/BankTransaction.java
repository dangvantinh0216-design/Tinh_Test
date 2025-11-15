package lap2_7;

public class BankTransaction {
	private String customerName ;
	private double depositAmount;
	private double maturity;
	public BankTransaction(String customerName, double depositAmount, double maturity) {
		super();
		this.customerName = customerName;
		this.depositAmount = depositAmount;
		this.maturity = maturity;
	}
	public double interest() {
		double rate;
		if ( depositAmount <= 1000 ) {
			 rate = 0.04 ;
		} else if (depositAmount <= 5000) {
			rate = 0.045 ;
		} else {
			rate = 0.05 ;
		} return depositAmount * rate  ;
	}
	public double payBack() {
		if (this.depositAmount <= 500) {
			return this.depositAmount * 0.0025 ;
		}else if (this.depositAmount <= 1500) {
			return 500*0.0025 + (this.depositAmount - 500) * 0.005;
		} else if ( this.depositAmount <= 2500) {
			return 500*0.0025 + 1000*0.005 + (this.depositAmount - 1500)  * 0.0075;
		} else {
			return 500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 + (this.depositAmount - 2500) * 0.01;
		}
		
	}

}

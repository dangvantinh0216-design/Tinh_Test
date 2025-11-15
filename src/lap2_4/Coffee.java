package lap2_4;

public class Coffee {
	private String coffeeType;    // Loại cà phê
    private double unitPrice;     // Giá mỗi pound
    private double weight;        // Số pounds bán

    // Constructor
    public Coffee(String coffeeType, double unitPrice, double weight) {
        this.coffeeType = coffeeType;
        this.unitPrice = unitPrice;
        this.weight = weight;
    }

    // Tính tổng tiền sau khi áp dụng giảm giá
    public double cost() {
        double total = unitPrice * weight;  // Giá gốc chưa giảm
        double discount = 0;

        if (weight >= 20000) {
            discount = 0.25;                // 25%
        } else if (weight >= 5000) {
            discount = 0.10;                // 10%
        }

        return total - (total * discount);  // Áp dụng giảm giá
    }

}

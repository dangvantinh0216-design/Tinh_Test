package lap2_1;

public class Employee {
	private String Name;
	private double hoursWorked;
	private double hourlyRate;
	public Employee(String name, double hoursWorked) {
		super();
		Name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = 12.0; //Mặc định là 12$/giờ 
	}
	//Kiểm tra giờ làm không vượt quá 100 giờ
	public boolean inValidHours() {
		return this.hoursWorked <= 100 ;
	}
	//Tính tổng lương
	public double wage() {
		return hoursWorked * hourlyRate ;
	}
	//Tính thuế 15%
	public  double tax() {
		if (this.wage() <= 240) {
			return 0.0;
		} else if (this.wage() <= 480) {
			return this.wage() * 0.15;
		}
		else {
			return this.wage() * 0.28;
		}
	}
	//Lương thực nhận
	public double netPay() {
		return this.wage() - this.tax();
	}
	//Tăng lương lên 14$/giờ
	public double raiseWage() {
		return this.wage() + 14;
	} 

}

package lap2_1;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	//Test cho phương thức kiểm tra số giờ làm việc không vượt quá 100 giờ
	public void testInValidHours () {
		Employee e1 = new Employee("Alice", 40);
		assertTrue(e1.inValidHours());
		Employee e2 = new Employee("Bob", 120);
		assertFalse(e2.inValidHours());
	}
	//Test tính tổng tiền
	public void testWage() {
		Employee e1 = new Employee("Alice", 40);
		assertEquals(e1.wage(), 480.0);
	}
	//Test tiền thuế
	public void testTax() {
		Employee e1 = new Employee("Alice", 40);
		assertEquals(e1.tax(), 72.0, 0.001);
		Employee e2 = new Employee("Bob", 120);
		assertEquals(e2.tax(), 403.2, 0.001);
		Employee e3 = new Employee("Mick", 20);
		assertEquals(e3.tax(), 0.0);
	}
	//Test lương thực nhận
	public void testNetPay() {
		Employee e1 = new Employee("Alice", 40);
		assertEquals(e1.netPay(), 408.0, 0.001);
		Employee e2 = new Employee("Bob", 120);
		assertEquals(e2.netPay(), 1036.8, 0.001);
		Employee e3 = new Employee("Mick", 20);
		assertEquals(e3.netPay(), 240.0);
	}
	//Test tăng lương
	public void testRaiseWage() {
		Employee e1 = new Employee("Alice", 40);
		assertEquals(e1.raiseWage(), 494.0);
		Employee e2 = new Employee("Bob", 120);
		assertEquals(e2.raiseWage(), 1454.0);
	}
	

}

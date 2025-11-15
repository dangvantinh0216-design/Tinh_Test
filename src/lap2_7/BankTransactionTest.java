package lap2_7;

import junit.framework.TestCase;

public class BankTransactionTest extends TestCase {
	//Test cho tiền lãi
	public void testInterest() {
		BankTransaction a = new BankTransaction("Nam", 800, 1);
		assertEquals(a.interest(), 32.0 , 0.001);
		BankTransaction b = new BankTransaction("Hai", 3000, 2);
		assertEquals(b.interest(), 135.0, 0.001);
		BankTransaction c = new BankTransaction("Minh", 10000, 2);
		assertEquals(c.interest(), 500.0, 0.001);
	}
	//Test cho tiền hoàn lại
public void testPayBack() {
	BankTransaction t1 = new BankTransaction("Thuy", 6000, 2);
	 BankTransaction t2 = new BankTransaction("Mai", 2500, 1);
	 BankTransaction t3 = new BankTransaction("Nam", 1500, 2);
	 BankTransaction t4 = new BankTransaction("Tien", 500, 2);
	 assertEquals(t1.payBack(), 48.75, 0.001);
	 assertEquals( t2.payBack(), 13.75, 0.001);
	 assertEquals(t3.payBack(), 6.25, 0.001);
	 assertEquals(t4.payBack(), 1.25, 0.001);
}
}

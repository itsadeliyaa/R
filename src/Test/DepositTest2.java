package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest2 {

	@Test
	public void testDeposit1() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();
		
		//Test method
		assertEquals(20720.464, test.Deposit(16000.0 , 9.0, 3),0.1);
	}
}

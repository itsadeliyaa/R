package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest {
	
	@Test
	public void testDeposit() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();

		//Test method
		assertEquals(101103.4893, test.Deposit(60000.0 , 11.0, 5),0.1);
	}

}

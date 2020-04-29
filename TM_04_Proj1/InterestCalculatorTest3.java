package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculatorTest3 {

	@Test
	public void test() {
		Account acc=new RDAccount(20000,6,34);
		assertEquals(1500,acc.calculateInterest(),.00001);
		acc=new RDAccount(20000,12,67);
		assertEquals(1700,acc.calculateInterest(),.00001);
	}

}

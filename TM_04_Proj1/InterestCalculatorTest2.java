package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculatorTest2 {

	@Test
	public void test() {
		Account acc=new FDAccount(20000,60,34);
		assertEquals(1400,acc.calculateInterest(),.00001);
		acc=new FDAccount(20000,180,67);
		assertEquals(1600,acc.calculateInterest(),.00001);
		acc=new FDAccount(400000,180,90);
		assertEquals(32000,acc.calculateInterest(),.00001);
	}

}

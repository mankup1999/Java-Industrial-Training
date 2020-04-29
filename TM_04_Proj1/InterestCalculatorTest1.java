package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculatorTest1 {

	@Test
	public void test() {
		Account acc=new SBAccount(20000);
		assertEquals(800,acc.calculateInterest(),.00001);
		acc=new SBAccount(2350);
		assertEquals(94,acc.calculateInterest(),.00001);
		acc=new SBAccount(400000);
		assertEquals(16000,acc.calculateInterest(),.00001);
	}

}

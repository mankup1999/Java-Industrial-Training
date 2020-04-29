package wipro;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 obj=new Demo2();
		
		assertEquals(true,obj.palindromeCheck("madam"));
		assertEquals(false,obj.palindromeCheck("Ram"));
		assertEquals(true,obj.palindromeCheck("malayalam"));
		assertEquals(true,obj.palindromeCheck("mom"));
	}

}

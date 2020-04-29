package wipro;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void concatTest() {
		Demo1 obj=new Demo1();
		assertEquals("helloworld",obj.concat("hello", "world"));
		assertEquals("hi there",obj.concat("hi ", "there"));
	}

}

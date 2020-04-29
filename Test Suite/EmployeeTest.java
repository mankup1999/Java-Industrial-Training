package wipro;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee emp=new Employee();
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Ram");
		arr.add("Shyam");
		arr.add("Shakti");
		arr.add("Julie");
		
		assertEquals("FOUND",emp.findName(arr,"Ram"));
		assertEquals("NOT FOUND",emp.findName(arr,"Ramachandra"));
		assertEquals("FOUND",emp.findName(arr,"Shyam"));
		assertEquals("NOT FOUND",emp.findName(arr,"Yash"));
	}

}

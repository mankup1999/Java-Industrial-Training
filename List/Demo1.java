import java.util.*;

public class Demo1
{
	public static void main(String[] args)
	{
		ArrayList<String> months=new ArrayList<String>(12);
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");

		for(String month:months)
			System.out.println(month);
	}
}

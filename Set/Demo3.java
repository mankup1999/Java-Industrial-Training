import java.util.*;

public class Demo3
{
	public static void main(String[] args)
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("Manku pathak");
		set.add("Madhurima shah");
		set.add("Anjali verma");
		set.add("Yamini kaur");
		System.out.println("Before Reversing: "+set);
		
		NavigableSet<String> set1=set.descendingSet();
		System.out.println("Before Reversing: "+set1);

		System.out.println("Using Iterator: ");
		Iterator<String> it=set1.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		System.out.print("Looking for element \"Shyam \"--->");
		if(set.contains("Shyam"))
			System.out.println("Status: Found");
		else	
			System.out.println("Status: Not Found");
	
	}
}

import java.util.*;

public class Demo3
{
	public static void main(String[] args)
	{
		ArrayList<String> x=new ArrayList<String>();
		x.add("Ram");
		x.add("Julie");
		x.add("Maths");
		x.add("India");
		
		printAll(x);
	}
	
	public static void printAll(ArrayList<String> x)
	{
		Iterator it=x.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}

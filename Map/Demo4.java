import java.util.*;

public class Demo4
{
	public static void main(String[] args)
	{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Manku","7085760436");
		map.put("Himanshu","9077781631");
		map.put("Jagdish","8969718336");
		map.put("Home","8002118493");
		Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> x=it.next();
			System.out.println("Name: "+x.getKey()+"  Contact: "+x.getValue());
		}
	}
}

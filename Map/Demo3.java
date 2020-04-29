import java.util.*;

public class Demo3
{
	public static void main(String[] args)
	{
		HashMap<String,String> map=new HashMap<String,String>();

		map.put("Bihar","Patna");
		map.put("Uttar Pradesh","Lucknow");
		map.put("Punjab","Chandigarh");
		map.put("Madhya Pradesh","Bhopal");
		map.put("Tripura","Agartala");
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 
          
		while(itr.hasNext()) 
		{ 
		     Map.Entry<String, String> entry = itr.next(); 
		     System.out.println("State = " + entry.getKey() +  
		                         ", Capital = " + entry.getValue()); 
		} 
	}
}

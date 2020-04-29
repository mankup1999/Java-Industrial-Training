import java.util.*;

public class Demo2
{
	public static void main(String[] args)
	{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("MKP","PKM");
		map.put("YES","SEY");
		map.put("madam","madam");
		
		boolean exist=keyExist(map,"MKP");
		if(exist)
			System.out.println("Key \"MKP\" exists in the map.");
		else
			System.out.println("Key \"MKP\" doesn\'t exist in the map.");
		exist=valueExist(map,"SEY");
		if(exist)
			System.out.println("Value \"SEY\" exists in the map.");
		else
			System.out.println("Value \"SEY\" doesn\'t exist in the map.");
		System.out.println("Iterating over the map:");
		iterate(map);
	}
	public static boolean keyExist(HashMap<String,String> map,String key)
	{
		Set<String> set=map.keySet();
		boolean Flag=false;
		for(String x:set)
			if(x.equals(key))
			{Flag=true;break;}
		return Flag;
	}
	public static boolean valueExist(HashMap<String,String> map,String value)
	{
		String[] set=map.values().toArray(new String[0]);
		boolean Flag=false;
		int l=set.length;
		for(int i=0;i<l;i++)
			if(set[i].equals(value))
			{Flag=true;break;}
		return Flag;
	}
	public static void iterate(HashMap<String,String> map)
	{
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 
          
		while(itr.hasNext()) 
		{ 
		     Map.Entry<String, String> entry = itr.next(); 
		     System.out.println(entry.getKey() + "--->" + entry.getValue()); 
		} 
	}
}

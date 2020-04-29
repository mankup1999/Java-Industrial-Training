import java.util.*;

class Example
{
	TreeMap<String,String> M1;
	public Example()
	{
		M1=new TreeMap<String,String>();
	}
	public TreeMap<String,String> saveCountryCapital(String CountryName,String capital)
	{
		M1.put(CountryName,capital);
		return M1;
	}
	public String getCapital(String CountryName)
	{
		return M1.get(CountryName);
	}
	public String getCountry(String capitalName)
	{
		String result=null;
		Set<String> keys=M1.keySet();
		for(String country:keys)
			if(M1.get(country).equals(capitalName))
				{result=country;break;}
		return result;
		
	}
	public TreeMap<String,String> alterMap()
	{
		TreeMap<String,String> newMap=new TreeMap<String,String>();
		Set<String> keys=M1.keySet();
		for(String country:keys)
			newMap.put(M1.get(country),country);
		return newMap;
	}
	public ArrayList<String> arrayListCountry()
	{
		ArrayList<String> list=new ArrayList<String>();
		Set<String> keys=M1.keySet();
		for(String country:keys)
			list.add(country);
		return list;
	}
	public String toString()
	{
		return M1.toString();
	}
}

public class Demo5
{
	public static void main(String args[])
	{
		Example x=new Example();
		TreeMap<String,String> y=x.saveCountryCapital("India","New Delhi");
		y=x.saveCountryCapital("England","London");
		y=x.saveCountryCapital("China","Bijing");
		y=x.saveCountryCapital("Pakistan","Islamabad");
		y=x.saveCountryCapital("Japan","Tokiyo");
		System.out.println("Map: "+x);

		System.out.println("Capital of India: "+x.getCapital("India"));
		System.out.println("Country for Islamabad: "+x.getCountry("Islamabad"));
		System.out.println("Altered Map: "+x.alterMap());
		System.out.println("Enlisting All Countries: "+x.arrayListCountry());
	}
}

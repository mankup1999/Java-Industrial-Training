import java.util.*;

class Example
{
	HashSet<String> country;
	public Example()
	{
		country=new HashSet<String>();
	}
	public void saveCountryNames(String CountryName)
	{
		country.add(CountryName);
	}
	public String getCountry(String CountryName)
	{
		if(country.contains(CountryName))
			return CountryName;
		return null;
	}
	public String toString()
	{
		return country.toString();
	}
}

public class Demo1
{
	public static void main(String[] args)
	{
		Example countries=new Example();
		countries.saveCountryNames("India");
		countries.saveCountryNames("India");
		countries.saveCountryNames("America");
		countries.saveCountryNames("China");
		countries.saveCountryNames("Russia");
		System.out.println("Set: "+countries);
		System.out.println("Results for getCountry:");
		System.out.println("India: "+countries.getCountry("India"));
		System.out.println("England: "+countries.getCountry("England"));
		System.out.println("Russia: "+countries.getCountry("Russia"));
		System.out.println("Germany: "+countries.getCountry("Germany"));
	}
}

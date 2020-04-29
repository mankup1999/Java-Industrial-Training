import java.util.Scanner;

class InvalidCountryException extends Exception
{
	public String toString()
	{
		return "User Outside India  cannot be registered";
	}
}

class USerRegistration
{
	public void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equalsIgnoreCase("India"))
		{
			System.out.println("User registration done successfully");
		}
		else
			throw new InvalidCountryException();
	}
}

public class Demo7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username and country:");
		String username=sc.next();
		String country=sc.next();
		try
		{
			USerRegistration reg=new USerRegistration();
			reg.registerUser(username,country);
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}		
		
	}
}

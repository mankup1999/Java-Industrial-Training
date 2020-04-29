
abstract class GeneralBank
{
	double savingsInterestRate;
	double fixedInterestRate;

	public abstract double getSavingsInterestRate();
	public abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank
{
	public double getSavingsInterestRate()
	{
		return 4;
	}
	public double getFixedInterestRate()
	{
		return 8.5;
	}
}

class KotMBank extends GeneralBank
{
	public double getSavingsInterestRate()
	{
		return 6;
	}
	public double getFixedInterestRate()
	{
		return 9;
	}
}

public class Sample1
{
	public static void main(String[] args)
	{
		ICICIBank i=new ICICIBank();
		System.out.println("ICICI Bank OBject(using same type reference)");
		System.out.println("\tSavings Interest Rate: "+i.getSavingsInterestRate());
		System.out.println("\tFixed Interest Rate: "+i.getFixedInterestRate());

		KotMBank k=new KotMBank();
		System.out.println("KotM Bank OBject(using same type reference)");
		System.out.println("\tSavings Interest Rate: "+k.getSavingsInterestRate());
		System.out.println("\tFixed Interest Rate: "+k.getFixedInterestRate());
		
		GeneralBank g=new KotMBank();
		System.out.println("KotM Bank OBject(using General Bank type reference)");
		System.out.println("\tSavings Interest Rate: "+g.getSavingsInterestRate());
		System.out.println("\tFixed Interest Rate: "+g.getFixedInterestRate());

		g=new ICICIBank();
		System.out.println("ICICI Bank OBject(using General Bank type reference)");
		System.out.println("\tSavings Interest Rate: "+g.getSavingsInterestRate());
		System.out.println("\tFixed Interest Rate: "+g.getFixedInterestRate());
	}
}








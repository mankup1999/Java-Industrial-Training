
abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		return "In the FirstClass";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "In the Ladies";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "In the General";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "In the Luggage";
	}
}

public class TestCompartment
{
	public static void main(String[] args)
	{
		Compartment[] cmpt=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			int cmpt_index=1+(int)(Math.random()*4);
			switch(cmpt_index)
			{
				case 1: cmpt[i]=new FirstClass();break;
				case 2: cmpt[i]=new Ladies();break;
				case 3: cmpt[i]=new General();break;
				case 4: cmpt[i]=new Luggage();break;
			}
			System.out.println(cmpt[i].notice());
		}
	}
}

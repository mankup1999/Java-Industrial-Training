
class Fruit
{
	String name;
	String taste;
	int size;

	public Fruit()
	{
		name="";
		taste="";
		size=0;
	}

	public Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}

	public String getName()
	{
		return name;
	}
	
	public String getTaste()
	{
		return taste;
	}
	public void eat()
	{
		System.out.println("\tName: "+name);
		System.out.println("\tTaste: "+taste);
	}
}

class Apple extends Fruit
{
	public Apple()
	{
		super("Apple","Sweet",3);
	}
	public void eat()
	{
		System.out.println("\tName: "+super.getName());
		System.out.println("\tTaste: "+super.getTaste());
	}
}

class Orange extends Fruit
{
	public Orange()
	{
		super("Orange","Sour",4);
	}
	public void eat()
	{
		System.out.println("\tName: "+super.getName());
		System.out.println("\tTaste: "+super.getTaste());
	}
}

public class Sample1
{
	public static void main(String[] args)
	{
		Fruit fruit=new Fruit();
		System.out.println("Fruit eat function:");
		fruit.eat();

		Apple apple=new Apple();
		System.out.println("Apple eat function:");
		apple.eat();

		Orange orange=new Orange();
		System.out.println("Orange eat function:");
		orange.eat();
	}
}


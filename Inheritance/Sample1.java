
class Animal
{
	public void eat()
	{
		System.out.println("Animal eat function is called");
	} 

	public void sleep()
	{
		System.out.println("Animal sleep function is called");
	} 
}

class Bird extends Animal
{
	public void eat()
	{
		System.out.println("Bird eat function is called");
	} 

	public void sleep()
	{
		System.out.println("Bird sleep function is called");
	} 

	public void fly()
	{
		System.out.println("Bird fly function is called");
	}
}

public class Sample1
{
	public static void main(String[] args)
	{
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird=new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}


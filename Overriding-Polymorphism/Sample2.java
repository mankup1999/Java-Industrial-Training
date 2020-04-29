
class Shape
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}

	public void erase()
	{
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}

	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}



class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}

	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Square");
	}

	public void erase()
	{
		System.out.println("Erasing Square");
	}
}

public class Sample2
{
	public static void main(String[] args)
	{
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();

		System.out.println("For Circle:");
		c.draw();
		c.erase();

		System.out.println("For Triangle:");
		t.draw();
		t.erase();

		System.out.println("For Square:");
		s.draw();
		s.erase();
	}
}

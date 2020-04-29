import java.util.*;

class Box
{
	double length;
	double width;
	double height;
	public Box(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public double volume()
	{
		return length*width*height;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	@Override
	public int hashCode()
	{
		return 0;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this.volume()==((Box)obj).volume())
		{
			System.out.println(this.volume());
			return true;
		}
		return false;
	}
}

public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Set<Box> set=new HashSet<Box>();
		System.out.println("Enter the number of Box");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Box "+(i+1)+" details");
			System.out.println("Enter Length");
			double length=sc.nextDouble();
			System.out.println("Enter Width");
			double width=sc.nextDouble();
			System.out.println("Enter Height");
			double height=sc.nextDouble();

			set.add(new Box(length,width,height));
		}
		System.out.println("Unique Boxes in the Set are");
		for(Box b:set)
			System.out.println("Length="+b.getLength()+" Width="+b.getWidth()+" Height="+b.getHeight()+" Volume="+b.volume());
	}
}

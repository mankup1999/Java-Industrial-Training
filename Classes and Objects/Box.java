public class Box
{
	double width;
	double height;
	double depth;

	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	public double getVolume()
	{
		return width*height*depth;
	}

	public static void main(String[] args)
	{
		Box box=new Box(5,6.2,3);
		
		System.out.println("The Volume of box1 is "+box.getVolume());
	}

}

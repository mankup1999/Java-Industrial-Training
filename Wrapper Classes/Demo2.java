public class Demo2
{
	public static void main(String[] args)
	{
		Integer a=new Integer(args[0]);
		System.out.println("Given Number :"+a);
		System.out.println("Binary Equivalent :"+Integer.toBinaryString(a));
		System.out.println("Octal Equivalent :"+Integer.toOctalString(a));
		System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(a));
	}
}

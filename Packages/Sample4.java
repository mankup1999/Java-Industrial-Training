import com.automobile.Vehicle;
import com.automobile.FourWheeler.Logan;
import com.automobile.FourWheeler.Ford;

public class Sample4
{
	public static void main(String[] args)
	{
		Logan l=new Logan();
		System.out.println("Logan Object");
		System.out.println(l.getModelName());
		System.out.println(l.getRegistrationNumber());
		System.out.println(l.getOwnerName());
		System.out.println("speed: "+l.speed());
		System.out.println("gps: "+l.gps());

		Ford f=new Ford();
		System.out.println("Ford Object");
		System.out.println(f.getModelName());
		System.out.println(f.getRegistrationNumber());
		System.out.println(f.getOwnerName());
		System.out.println("speed: "+f.speed());
		System.out.println("tmpControl: "+f.tempControl());
	}

}

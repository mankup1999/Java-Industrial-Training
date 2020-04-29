import com.automobile.Vehicle;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Sample3
{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle();
		System.out.println("Vehicle Object:");
		System.out.println("\t"+v.getModelName());
		System.out.println("\t"+v.getRegistrationNumber());
		System.out.println("\t"+v.getOwnerName());

		Hero h=new Hero();
		System.out.println("Hero Object:");
		System.out.println("\tSpeed: "+h.getSpeed());
		h.radio();

		Honda h1=new Honda();
		System.out.println("Honda Object:");
		System.out.println("\tSpeed: "+h1.getSpeed());
		h1.cdplayer();
	}
}

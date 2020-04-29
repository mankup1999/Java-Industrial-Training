import java.util.*;

public class Demo4{

	public static void main(String[] args){
	
	ArrayList<Number> list=new ArrayList<Number>();
	list.add(1);
	list.add(10.03f);
	list.add(2.333);
	//list.add("mohan");
	Iterator<Number> it=list.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	}
}

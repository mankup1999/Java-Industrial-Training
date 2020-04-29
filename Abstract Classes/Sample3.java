
abstract class Instrument
{
	public abstract String play();
}

class Piano extends Instrument
{
	public String play()
	{
		return "Piano is playing  tan tan tan tan  ";
	}
}

class Flute extends Instrument
{
	public String play()
	{
		return "Flute is playing  toot toot toot toot";
	}
}

class Guitar extends Instrument
{
	public String play()
	{
		return "Guitar is playing  tin  tin  tin ";
	}
}


public class Sample3
{
	public static void main(String[] args)
	{
		Instrument[] inst=new Instrument[10];
		for(int i=0;i<10;i++)
		{
			int inst_index=1+(int)(Math.random()*3);
			String category="";
			switch(inst_index)
			{
				case 1: inst[i]=new Piano();break;
				case 2: inst[i]=new Flute();break;
				case 3: inst[i]=new Guitar();break;
			}
			if(inst[i] instanceof Piano)
				category="Paino";
			else if(inst[i] instanceof Flute)
				category="Flute";
			else if(inst[i] instanceof Guitar)
				category="Guitar";
			System.out.println(category+" stored at index: "+(i+1));
			System.out.println(inst[i].play());
		}
	}
}

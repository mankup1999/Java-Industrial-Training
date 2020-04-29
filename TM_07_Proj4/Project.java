import java.util.*;

class Card
{
	char symbol;
	int no;
	public Card(char symbol,int no)
	{
		this.symbol=symbol;
		this.no=no;
	}
	public char getSymbol()
	{
		return symbol;
	}
	public int getNo()
	{
		return no;
	}
}


public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Character,ArrayList<Integer>> map=new HashMap<Character,ArrayList<Integer>>();
		System.out.println("Enter Number of Cards:");
		int numCards=sc.nextInt();
		for(int i=0;i<numCards;i++)
		{
			System.out.println("Enter card "+(i+1)+":");
			char symbol=sc.next().charAt(0);
			int no=sc.nextInt();
			Card card=new Card(symbol,no);
			addCard(map,card.getSymbol(),card.getNo());
		}
		TreeSet<Character> symbolSet=new TreeSet(map.keySet());
		System.out.println("Distinct Symbols are: ");
		for(char ch:symbolSet)	
			System.out.print(ch+" ");
		System.out.println();
		for(char ch:symbolSet)
		{
			System.out.println("Cards in "+ch+" Symbol");
			ArrayList<Integer> list=map.get(ch);
			int count=0;
			int sum=0;
			for(int value:list)
			{
				count++;
				sum+=value;
				System.out.println(ch+" "+value);
			}
			System.out.println("Number of cards: "+count);
			System.out.println("Sum of Numbers: "+sum);
		}
	}
	public static void addCard(HashMap<Character,ArrayList<Integer>> map,char symbol,int no)
	{
		Set<Character> keys=map.keySet();
		for(char ch:keys)
		{
			if(ch==symbol)
			{
				ArrayList<Integer> list=map.get(ch);
				list.add(no);
				map.put(ch,list);
				return;
			}
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(no);
		map.put(symbol,list);
	}
}


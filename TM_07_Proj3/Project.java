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
		LinkedHashSet<Card> cards=new LinkedHashSet<Card>();
		TreeSet<Character> symbols=new TreeSet<Character>();
		
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter a Card:");
			char symbol=sc.next().charAt(0);
			int no=sc.nextInt();
			cards.add(new Card(symbol,no));
			symbols.add(symbol);
		}
		System.out.println("Four symbols gathered in 8 cards.");
		System.out.println("Cards in Set are:");
		for(char symbol:symbols)
			System.out.println(symbol+" "+getValue(cards,symbol));
	}
	public static int getValue(LinkedHashSet<Card> cards,char symbol)
	{
		int result=-1;
		for(Card card:cards)
		{
			if(card.getSymbol()==symbol)
			{
				result=card.getNo();
				break;
			}
		}
		return result;
	}
}




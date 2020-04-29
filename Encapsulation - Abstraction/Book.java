
class Author
{
	String name;
	String email;
	char gender;
	
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}

	public char getGender()
	{
		return gender;
	}
}

public class Book
{
	String name;
	Author author;
	double price;
	int qtyInStock;

	public Book(String name,Author author,double price,int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}

	public String getName()
	{
		return name;
	}

	public Author getAuthor()
	{
		return author;
	}

	public double getPrice()
	{
		return price;
	}

	public int getQtyInStock()
	{
		return qtyInStock;
	}


	public static void main(String[] args)
	{
		Book book=new Book("ABC",new Author("XYZ","abc@xyz.com",'M'),276.5,5);

		System.out.println("Book Details:");
		System.out.println("\tName: "+book.getName());
		System.out.println("\tPrice: "+book.getPrice());
		System.out.println("\tQuantity in Stock: "+book.getQtyInStock());

		Author author=book.getAuthor();

		System.out.println("\nAuthor Details:");
		System.out.println("\tName: "+author.getName());
		System.out.println("\tEmail: "+author.getEmail());
		System.out.println("\tGender: "+author.getGender());
	}
}

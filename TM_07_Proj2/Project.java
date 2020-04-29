import java.util.*;

public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		while(true)
		{
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter the item to be inserted:");
				String item=sc.next();
				list.add(item);
				System.out.println("Inserted successfully");
			}
			else if(choice==2)
			{
				System.out.println("Enter the item to search:");
				String item=sc.next();
				if(list.contains(item))
					System.out.println("Item found in the list.");
				else
					System.out.println("Item not found in the list.");
			}
			else if(choice==3)
			{
				System.out.println("Enter the item to delete:");
				String item=sc.next();
				if(list.contains(item)==false)
					System.out.println("Item does not exist");
				else
				{
					list.remove(item);
					System.out.println("Deleted successfully");
				}	
			}
			else if(choice==4)
			{
				System.out.println("The items in the list are:");
				for(String item:list)
					System.out.println(item);
			}
			else if(choice==5)
				break;
			else
				System.out.println("Incorrect choice. Try Again.");
		}
	}
}

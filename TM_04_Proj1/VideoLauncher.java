package Project;


/*

	Project Title- "Video Rental Inventory System"
	
*/


//importing Scanner lib for user's inputs
import java.util.Scanner;

//Declaring Video class
class Video
{
	//Attributes
	String videoName;
	boolean checkout;
	int rating;

	//constructor
	public Video(String name)
	{
		videoName=name;
		checkout=false;
		rating=0;
	}
	//Methods
	public String getName()
	{
		return videoName;
	}

	public void doCheckout()
	{
		checkout=true;
	}

	public void doReturn()
	{
		checkout=false;
	}

	public void receiveRating(int rating)
	{
		this.rating=rating;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public boolean getCheckout()
	{
		return checkout;
	}

	//Helping Setter function
	public void setCheckout(boolean checkout)
	{
		this.checkout=checkout;
	}
}


//Declaring Video Store class
class VideoStore
{
	//Attributes
	Video[] store;
	//Helping attribute for no. of movies stored currently
	public static int noOfMovies=-1;

	//constructor
	public VideoStore(int n)
	{
		store=new Video[n];
	}

	//Methods
	public void addVideo(String name)
	{
		if(noOfMovies<store.length-1)
		{
			noOfMovies++;
			store[noOfMovies]=new Video(name); 	
		}
		else
			System.out.println("Can't add any video[List Full]");
	}

	public void doCheckout(String name)
	{
		int index=indexFind(name);
		if(index==-1)
			System.out.println("No such movie is available");
		else
			(store[index]).doCheckout();

	}

	public void doReturn(String name)
	{
		int index=indexFind(name);
		if(index==-1)
			System.out.println("No such movie is available");
		else
			(store[index]).setCheckout(false);

	}

	public void receiveRating(String name,int rating)
	{
		int index=indexFind(name);
		if(index==-1)
			System.out.println("No such movie is available");
		else
			(store[index]).receiveRating(rating);

	}

	public void listInventory()
	{
		if(noOfMovies==-1)
			System.out.println("There is no movie in the store");
		else
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.print("Video Name   |"+"   Checkout Status   |"+"    Rating\n");
			for(int i=0;i<=noOfMovies;i++)
				System.out.print(store[i].getName()+"   |"+"   "+store[i].getCheckout()+"   |"+"    "+store[i].getRating()+"\n");

			System.out.println("-----------------------------------------------------------------");
		}

	}


	//Helping function
	public int indexFind(String name)
	{
		for(int i=0;i<=noOfMovies;i++)
			if(((store[i]).getName()).equals(name))
				return i;
		return -1;
	}

	
}

//Main class Video Launcher Declaration

public class VideoLauncher
{
	//Initial fixed capacity due to Array
	public static final int capacityOfStore=10; 
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		VideoStore store=new VideoStore(capacityOfStore);
		
		//Implementing the logic
		while(true)
		{
			System.out.println("\nMAIN MENU");
			System.out.println("==========");
			System.out.println("1. Add Videos");
			System.out.println("2. Check Out Video");
			System.out.println("3. Return Video");
			System.out.println("4. Receive Rating");
			System.out.println("5. List Inventory");
			System.out.println("6. Exit");
			System.out.print("Enter your choice (1..6): ");
			int option=input.nextInt();
			if(option==1)
			{
				System.out.print("Enter the name of the video you want to add: ");
				String name=input.next();
				store.addVideo(name);
				System.out.println("Video \""+name+"\" added successfully.");
			}
			else if(option==2)
			{
				System.out.print("Enter the name of the video you want to check out: ");
				String name=input.next();
				store.doCheckout(name);
				if((store.indexFind(name))!=-1)
					System.out.println("Video \""+name+"\" checked out successfully.");
			}
			else if(option==3)
			{
				System.out.print("Enter the name of the video you want to Return: ");
				String name=input.next();
				store.doReturn(name);
				if((store.indexFind(name))!=-1)
					System.out.println("Video \""+name+"\" returned successfully.");
			}
			else if(option==4)
			{
				System.out.print("Enter the name of the video you want to rate: ");
				String name=input.next();
				if((store.indexFind(name))!=-1)
				{
					System.out.print("Enter the rating for this video: ");
					int rating=input.nextInt();
					store.receiveRating(name,rating);
					System.out.println("Rating \""+rating+"\" has been mapped to the Video \""+name+"\".");
				}
			}
			else if(option==5)
			{
				store.listInventory();
			}
			else if(option==6)
			{
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			}
			else
				System.out.println("Please enter the correct option");


		}
		
	}
}
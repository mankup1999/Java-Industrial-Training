
import java.sql.*;

public class Demo2
{
	public static void main(String[] args)
	{
		Connection conn=null;
		try
		{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1531:XE","HR","HR");
			if(conn!=null)
				System.out.println("Connection Established successfully");
			else
				System.out.println("Connection could not be established");
		}
		catch(Exception e)	
		{
			e.printStackTrace();
		}
	}
}

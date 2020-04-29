import java.sql.*;

public class Demo1
{
	public static void main(String[] args) throws Exception
	{
		Connection conn=null;
		Statement stmt=null;
		try
		{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1531:XE","HR","HR");
			if(conn!=null)
			{
				String query="select employee_id,last_name from employees";
				stmt=conn.createStatement();
				ResultSet res=stmt.executeQuery(query);
				while(res.next())
				{
					int empId=res.getInt(1);
					String empName=res.getString(2);
					System.out.println(empId+" "+empName);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(conn!=null)
				conn.close();
			if(stmt!=null)
				stmt.close();	
		}
	}
}

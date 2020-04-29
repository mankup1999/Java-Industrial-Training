import java.sql.*;

public class Demo2
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
				String query="select first_name||' '||last_name as ename,salary,commission_pct,jobs.job_title from employees,jobs where jobs.job_id=employees.job_id and salary>1000 and salary<2000";
				stmt=conn.createStatement();
				ResultSet res=stmt.executeQuery(query);
				System.out.format("%s%30s%30s%30s\n","ename","job","sal","comm");
				while(res.next())
				{
					String empName=res.getString("ename");
					String job=res.getString("job_title");
					double salary=res.getDouble("salary");
					double comm=res.getDouble("commission_pct");
					System.out.format("%s%30s%30f%30f\n",empName,job,(float)salary,(float)comm);
					System.out.println(empName+" "+job+" "+salary+" "+comm);
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

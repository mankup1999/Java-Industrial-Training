import java.sql.*;

public class JDBCCalls
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			DAOClass obj=new DAOClass();
			int choice=Integer.parseInt(args[0].trim());
			if(choice==1)
			{
				int roll=Integer.parseInt(args[1].trim());
				String name=args[2].trim();
				String std=args[3].trim();
				String date=args[4].trim();
				System.out.println(date);

				Double fee=Double.parseDouble(args[5].trim());
				obj.insert(roll,name,std,date,fee);
			}
			else if(choice==2)
			{
				int roll=Integer.parseInt(args[1].trim());
				obj.delete(roll);
			}
			else if(choice==3)
			{
				int roll=Integer.parseInt(args[1].trim());
				Double fee=Double.parseDouble(args[2].trim());
				obj.modify(roll,fee);
			}
			else if(choice==4)
			{
				int len=args.length;
				if(len==1)
					obj.display();
				else
				{
					int roll=Integer.parseInt(args[1].trim());
					obj.display(roll);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class DAOClass
{
	Connection conn=null;
	public DAOClass() throws Exception
	{
		ConnectionClass x=new ConnectionClass();
		conn=x.connectionFactory();
	}
	public void insert(int roll,String name,String std,String date,Double fee) throws SQLException
	{
		String query="insert into student values ("+roll+",'"+name+"','"+std+"','"+date+"',"+fee+")";
		System.out.println(query);
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.executeUpdate();
		conn.close();
	}
	public void delete(int roll) throws SQLException
	{
		String query="delete from student where RollNo="+roll;
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.executeUpdate();
		conn.close();
	}
	public void modify(int roll,Double fee) throws SQLException
	{
		String query="update student set Fees="+fee+" where RollNo="+roll;
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.executeUpdate();
		conn.close();		
	}
	public void display(int roll) throws SQLException
	{
		String query="select * from student where RollNo="+roll;
		PreparedStatement pstmt=conn.prepareStatement(query);
		ResultSet res=pstmt.executeQuery();
		System.out.println("Roll\tName\tStandard\tDate\tFee");
		while(res.next())
		{
			int roll1=res.getInt(1);
			String name=res.getString(2);
			String std=res.getString(3);
			Date date=res.getDate(4);
			double fee=res.getDouble(5);
			System.out.println(roll+"\t"+name+"\t"+std+"\t"+date+"\t"+fee);
		}
		conn.close();		
	}
	public void display() throws SQLException
	{
		String query="select * from student";
		PreparedStatement pstmt=conn.prepareStatement(query);
		ResultSet res=pstmt.executeQuery();
		System.out.println("Roll\tName\tStandard\tDate\tFee");
		while(res.next())
		{
			int roll=res.getInt(1);
			String name=res.getString(2);
			String std=res.getString(3);
			Date date=res.getDate(4);
			double fee=res.getDouble(5);
			System.out.println(roll+"\t"+name+"\t"+std+"\t"+date+"\t"+fee);
		}
		conn.close();		
	}
}

class ConnectionClass
{
	public Connection connectionFactory() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1531:XE","HR","HR");
	}
}













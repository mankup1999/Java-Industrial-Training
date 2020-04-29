/*
//Stored procedure in sql
create or replace procedure fun(empId in number,empName out varchar2,netSalary out number)
as
normalSalary number;commission number;grossSalary number;IT number;
begin
    select first_name||' '||last_name into empName from employees where employee_id=empId;
    select salary into normalSalary from employees where employee_id=empId;
    select commission_pct into commission from employees where employee_id=empId;
    grossSalary:=normalSalary+(normalSalary*commission)/100;
    if commission is null then
        grossSalary:=normalSalary;
        IT:=(grossSalary*10)/100;
    elsif commission < 500 then
        IT:=(grossSalary*15)/100;
    else
        IT:=(grossSalary*20)/100;
    end if;
    netSalary:=grossSalary-IT;
end fun;

*/

import java.io.*;
import java.sql.*;

public class P {

    public static void main(String[] args) {

   	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1531:XE", "HR", "HR");
		PreparedStatement pstmt=conn.prepareStatement("select employee_id from employees");
		ResultSet res=pstmt.executeQuery();
		System.out.format("%5s%20s%15s\n","empno","ename","net salary");
		CallableStatement stmt=null;
		while(res.next())
		{
			stmt=conn.prepareCall("{call fun(?,?,?)}");
			Console c=System.console();
			Integer empID=res.getInt("employee_id");//new Integer(c.readLine("Emp ID: "));
			stmt.setObject(1,empID);
			stmt.registerOutParameter(2,Types.VARCHAR);
			stmt.registerOutParameter(3,Types.DOUBLE);
			stmt.execute();
			System.out.format("%5d%20s%15f\n",empID,stmt.getString(2),(float)stmt.getDouble(3));
		}
		stmt.close();
		pstmt.close();
		conn.close();
	}										
       catch (Exception e) 
	{
            e.printStackTrace();
	}

    }
}


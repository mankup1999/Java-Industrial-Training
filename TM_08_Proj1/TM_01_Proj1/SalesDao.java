package com.wipro.sales.dao;

import com.wipro.sales.util.DBUtil;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class SalesDao
{
	public int insertSales(Sales sales) throws Exception
	{
		Connection conn=DBUtil.getDBConnection();
		/*
		if(conn!=null)
			System.out.println("Connected");
		System.out.println(conn);
		*/
		String query="insert into tbl_sales values (";
		query+="'"+sales.getSalesID()+"',";
		Date date=sales.getSalesDate();
		SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		String dateStr=fmt.format(date);
		query+="'"+dateStr+"',";
		query+="'"+sales.getProductID()+"',";
		query+=sales.getQuantitySold()+",";
		query+=sales.getSalesPricePerUnit()+")";
		//System.out.println(query);
		PreparedStatement stmt=conn.prepareStatement(query);	
		return stmt.executeUpdate();			
	}


	public String generateSalesID(Date salesDate) throws Exception
	{
		SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		String dateStr=fmt.format(salesDate);
		Connection conn=DBUtil.getDBConnection();
		String query="select seq_sales_id.nextval from dual";
		PreparedStatement stmt=conn.prepareStatement(query);
		ResultSet res=stmt.executeQuery();
		res.next();
		return dateStr.substring(6)+res.getInt("nextval");
	}

	public ArrayList<SalesReport> getSalesReport() throws Exception
	{
		Connection conn=DBUtil.getDBConnection();
		String query="select * from v_sales_report";
		PreparedStatement stmt=conn.prepareStatement(query);
		ResultSet res=stmt.executeQuery();
		
		ArrayList<SalesReport> report=new ArrayList<SalesReport>();
		while(res.next())
		{
			SalesReport data=new SalesReport();
			data.setSalesID(res.getString("sales_id"));
			data.setSalesDate(res.getDate("sales_date"));
			data.setProductID(res.getString("product_id"));
			data.setProductName(res.getString("product_name"));
			data.setQuantitySold(res.getInt("quantity_sold"));
			data.setProductUnitPrice(res.getDouble("product_unit_price"));
			data.setSalesPricePerUnit(res.getDouble("sales_price_per_unit"));
			data.setProfitAmount(res.getDouble("profit_amount"));
			report.add(data);
		}
		return report;
	}	


	/*
	public static void main(String[] args) throws Exception
	{
		SalesDao obj=new SalesDao();
		//Sales x=new Sales();
		//x.setSalesID("5001");
		//SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		//x.setSalesDate(fmt.parse("12-10-19"));
		//x.setProductID("ip1002");
		//x.setQuantitySold(20);
		//x.setSalesPricePerUnit(2000);
		//System.out.println(obj.insertSales(x));
		
		//SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		//Date date=fmt.parse("12-01-19");
		//System.out.println(obj.generateSalesID(date));
		//ArrayList<SalesReport> report=obj.getSalesReport();
		//for(SalesReport x:report)
		//	System.out.println(x.getProfitAmount());
	}
	*/
}






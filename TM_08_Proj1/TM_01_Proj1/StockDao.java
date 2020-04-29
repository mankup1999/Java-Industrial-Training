package com.wipro.sales.dao;

import com.wipro.sales.util.DBUtil;
import com.wipro.sales.bean.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StockDao
{
	public int insertStock(Product sales) throws Exception
	{
		String query="insert into tbl_stock values (";
		query+="'"+sales.getProductID()+"',";
		query+="'"+sales.getProductName()+"',";
		query+=sales.getQuantityOnHand()+",";
		query+=sales.getProductUnitPrice()+",";
		query+=sales.getReorderLevel()+")";
		//System.out.println(query);
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement stmt=conn.prepareStatement(query);
		return stmt.executeUpdate();
	}

	public String generateProductID(String productName) throws Exception
	{
		String query="select seq_product_id.nextval from dual";
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement stmt=conn.prepareStatement(query);
		ResultSet res=stmt.executeQuery();
		res.next();
		return productName.substring(0,2)+res.getInt("nextval");
	}

	public int updateStock(String productID,int soldQty) throws Exception
	{
		String query="update tbl_stock set quantity_on_hand=quantity_on_hand-"+soldQty+" where product_id='"+productID+"'";
		//System.out.println(query);
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement stmt=conn.prepareStatement(query);
		return stmt.executeUpdate();
	}

	public Product getStock(String productID) throws Exception
	{
		String query="select * from tbl_stock where product_id='"+productID+"'";
		//System.out.println(query);
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement stmt=conn.prepareStatement(query);
		ResultSet res=stmt.executeQuery();
		Product p=new Product();
		boolean flag=false;
		while(res.next())
		{
			flag=true;
			p.setProductID(res.getString("product_id"));
			p.setProductName(res.getString("product_name"));
			p.setQuantityOnHand(res.getInt("quantity_on_hand"));
			p.setProductUnitPrice(res.getDouble("product_unit_price"));
			p.setReorderLevel(res.getInt("reorder_level"));
		}
		if(flag)
			return p;
		return null;
	}

	public int deleteStock(String productID) throws Exception
	{
		String query="delete from tbl_stock where product_id='"+productID+"'";
		//System.out.println(query);
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement stmt=conn.prepareStatement(query);
		return stmt.executeUpdate();
	}

	/*
	public static void main(String[] args) throws Exception
	{
		StockDao obj=new StockDao();
		Product p=new Product();
		p.setProductID("10");
		p.setProductName("Manku");
		p.setQuantityOnHand(10);
		p.setProductUnitPrice(400);
		p.setReorderLevel(1);
		//System.out.println(obj.insertStock(p));
		//System.out.println(obj.generateProductID("Reliance"));
		//System.out.println(obj.updateStock("10",2));
		//System.out.println(obj.getStock("10").getProductName());
		//System.out.println(obj.deleteStock("10"));
	}
	*/
}













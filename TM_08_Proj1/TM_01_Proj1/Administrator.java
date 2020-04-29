package com.wipro.sales.service;

import com.wipro.sales.bean.*;
import com.wipro.sales.dao.*;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Administrator
{
	public String insertStock(Product product) throws Exception
	{
		String msg="Data not Valid for insertion";
		if(product==null)
			return msg;
		String productName=product.getProductName();
		//System.out.println(productName);
		if(productName.length()<2)
			return msg;
		StockDao x=new StockDao();
		msg=x.generateProductID(productName);
		product.setProductID(msg);
		x.insertStock(product);
		return msg;
			
	}

	public String deleteStock(String productID) throws Exception
	{
		StockDao x=new StockDao();
		int status=x.deleteStock(productID);
		if(status<=0)
			return "record can not be deleted";
		return "deleted";
	} 

	public String insertSales(Sales sales) throws Exception
	{
		if(sales==null)
			return "Object not valid for insertion";
		String productID=sales.getProductID();
		//if(productID==null || productID.length==0)
		//	return "Unknown Product for sales";
		StockDao x=new StockDao();
		Product product;
		try
		{
			product=x.getStock(productID);
			if(product==null)
				throw new Exception();
		}
		catch(Exception e)
		{
			return "Unknown Product for sales";
		}
		int qtyOnHand=product.getQuantityOnHand();
		int qtySold=sales.getQuantitySold();
		//System.out.println(qtySold);
		if(qtyOnHand<qtySold)
			return "Not enough stock on hand for sales";

		SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yyyy");
		String salesDateStr=fmt.format(sales.getSalesDate());
		String currDateStr=fmt.format(new Date());
		if(currDateStr.compareTo(salesDateStr)<0)
			return "Invalid Date";
		SalesDao y=new SalesDao();
		String salesID=y.generateSalesID(sales.getSalesDate());
		sales.setSalesID(salesID);
		int status=y.insertSales(sales);
		if(status!=0)
		{
			status=x.updateStock(productID,qtySold);
			return "Sales Completed";
		}
		return "Error";
		
	}

	public ArrayList<SalesReport> getSalesReport() throws Exception
	{
		SalesDao x=new SalesDao();
		return x.getSalesReport();
	}
	
	/*
	public static void main(String[] args) throws Exception
	{
		Administrator a=new Administrator();
		Product p=new Product();
		p.setProductName("Manku");
		p.setQuantityOnHand(20);
		p.setProductUnitPrice(2000);	
		p.setReorderLevel(2);
		
		//System.out.println(a.insertStock(p));
		//System.out.println(a.deleteStock("Ma1007"));
		Sales s=new Sales();
		SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		s.setSalesDate(fmt.parse("12-01-99"));
		s.setProductID("ip1002");
		s.setQuantitySold(1);
		s.setSalesPricePerUnit(200);
		//System.out.println(a.insertSales(s));
		//ArrayList<SalesReport> salesReport=a.getSalesReport();
		//for(SalesReport xyz:salesReport)
		//	System.out.println(xyz.getProductID());
	}
	*/
}











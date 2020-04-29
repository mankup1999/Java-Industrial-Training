package com.wipro.sales.bean;

import java.util.*;
import java.text.*;

public class Sales
{
	String salesID;
	Date salesDate;
	String productID;
	int quantitySold;
	double salesPricePerUnit;

	public void setSalesID(String salesID)
	{
		this.salesID=salesID;
	}
	public String getSalesID()
	{
		return salesID;
	}

	public void setSalesDate(Date salesDate)
	{
		this.salesDate=salesDate;
	}
	public Date getSalesDate()
	{
		return salesDate;
	}

	public void setProductID(String productID)
	{
		this.productID=productID;
	}
	public String getProductID()
	{
		return productID;
	}

	public void setQuantitySold(int quantitySold)
	{
		this.quantitySold=quantitySold;
	}
	public int getQuantitySold()
	{
		return quantitySold;
	}

	public void setSalesPricePerUnit(double salesPricePerUnit)
	{
		this.salesPricePerUnit=salesPricePerUnit;
	}
	public double getSalesPricePerUnit()
	{
		return salesPricePerUnit;
	}


	/*
	public static void main(String[] args) throws Exception //--related to SimpleDateFormat.parse() function
	{
		Sales p=new Sales();
		p.setSalesID("1000");
		SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		p.setSalesDate(fmt.parse("12-01-99"));
		p.setProductID("1000");
		p.setQuantitySold(20);
		p.setSalesPricePerUnit(30);
		String id=p.getSalesID();
		Date date=p.getSalesDate();
		String name=p.getProductID();
		int qty=p.getQuantitySold();
		double price=p.getSalesPricePerUnit();
		System.out.println(id);
		System.out.println(fmt.format(date));
		System.out.println(name);
		System.out.println(qty);
		System.out.println(price);

	}
	*/
	
	
}





package com.wipro.sales.bean;

import java.util.*;
import java.text.*;

public class SalesReport
{
	String salesID;
	Date salesDate;
	String productID;
	String productName;
	int quantitySold;
	double productUnitPrice;
	double salesPricePerUnit;
	double profitAmount;

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

	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public String getProductName()
	{
		return productName;
	}

	public void setQuantitySold(int quantitySold)
	{
		this.quantitySold=quantitySold;
	}
	public int getQuantitySold()
	{
		return quantitySold;
	}

	public void setProductUnitPrice(double productUnitPrice)
	{
		this.productUnitPrice=productUnitPrice;
	}
	public double getProductUnitPrice()
	{
		return productUnitPrice;
	}

	public void setSalesPricePerUnit(double salesPricePerUnit)
	{
		this.salesPricePerUnit=salesPricePerUnit;
	}
	public double getSalesPricePerUnit()
	{
		return salesPricePerUnit;
	}

	public void setProfitAmount(double profitAmount)
	{
		this.profitAmount=profitAmount;
	}
	public double getProfitAmount()
	{
		return profitAmount;
	}

	/*
	public static void main(String[] args) throws Exception //--related to SimpleDateFormat.parse() function
	{
		SalesReport p=new SalesReport();
		p.setSalesID("1000");
		SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
		p.setSalesDate(fmt.parse("12-01-99"));
		p.setProductID("1000");
		p.setProductName("Reliance");
		p.setQuantitySold(20);
		p.setProductUnitPrice(30);
		p.setSalesPricePerUnit(30);
		p.setProfitAmount(0);
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
		System.out.println(p.getProductName()+" "+p.getProductUnitPrice()+" "+p.getProfitAmount());

	}
	*/



}

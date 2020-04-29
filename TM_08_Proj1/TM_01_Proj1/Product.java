package com.wipro.sales.bean;

public class Product
{
	String productID;
	String productName;
	int quantityOnHand;
	double productUnitPrice;
	int reorderLevel;

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

	public void setQuantityOnHand(int quantityOnHand)
	{
		this.quantityOnHand=quantityOnHand;
	}
	public int getQuantityOnHand()
	{
		return quantityOnHand;
	}

	public void setProductUnitPrice(double productUnitPrice)
	{
		this.productUnitPrice=productUnitPrice;
	}
	public double getProductUnitPrice()
	{
		return productUnitPrice;
	}

	public void setReorderLevel(int reorderLevel)
	{
		this.reorderLevel=reorderLevel;
	}
	public int getReorderLevel()
	{
		return reorderLevel;
	}
	/*
	public static void main(String[] args)
	{
		Product p=new Product();
		p.setProductID("1000");
		p.setProductName("Reliance");
		p.setQuantityOnHand(20);
		p.setProductUnitPrice(30);
		p.setReorderLevel(10);
		String id=p.getProductID();
		String name=p.getProductName();
		int qty=p.getQuantityOnHand();
		double price=p.getProductUnitPrice();
		int lvl=p.getReorderLevel();
		System.out.println(id);
		System.out.println(name);
		System.out.println(qty);
		System.out.println(price);
		System.out.println(lvl);

	}
	*/
}

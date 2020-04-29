package com.wipro.sales.main;

import com.wipro.sales.bean.*;
import com.wipro.sales.dao.*;
import com.wipro.sales.service.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SalesApplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Menu:-");
		System.out.println("\t1. Insert Stock");
		System.out.println("\t2. Delete Stock");
		System.out.println("\t3. Insert Sales");
		System.out.println("\t4. View Sales Report");
		System.out.println("Enter your Choice:");
		int choice=sc.nextInt();
		Administrator admin=new Administrator();
		if(choice==1)
		{
			try
			{			
				Product product=new Product();
				System.out.println("\nEnter Stock Details:");
				System.out.print("Stock Name: ");
				product.setProductName(sc.nextLine()+sc.nextLine());
				//System.out.println(product.getProductName());
				System.out.print("Quantity On Hand: ");
				product.setQuantityOnHand(sc.nextInt());
				System.out.print("Product Unit Price: ");
				product.setProductUnitPrice(sc.nextDouble());
				System.out.print("Reorder Level: ");
				product.setReorderLevel(sc.nextInt());
				System.out.println(admin.insertStock(product));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else if(choice==2)
		{
			try
			{
				System.out.println("\nEnter Stock ID: ");
				String productID=sc.next();
				System.out.println(admin.deleteStock(productID));
			}
			catch(Exception e)
			{
				String msg=e.getMessage();
				if(msg.contains("child record found"))
					msg="Record exists in Sales(can not delete)";
				System.out.println(msg);
			}
		}
		else if(choice==3)
		{
			try
			{
				Sales sales=new Sales();
				System.out.println("\nEnter Sales Details:");
				System.out.print("Sales Date: ");
				SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
				sales.setSalesDate(fmt.parse(sc.next()));
				System.out.print("Product ID: ");
				sales.setProductID(sc.next());
				System.out.print("Quantity Sold: ");
				sales.setQuantitySold(sc.nextInt());
				System.out.print("Sales Price Per Unt: ");
				sales.setSalesPricePerUnit(sc.nextDouble());
				System.out.print(admin.insertSales(sales));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());

			}	
		}
		else if(choice==4)
		{
			try
			{
				ArrayList<SalesReport> report=admin.getSalesReport();
				if(report.size()>0)
				System.out.format("%15s%15s%15s%15s%15s%15s%15s%15s\n","Sales ID","Sales Date","Product ID","Product Name","Quantity Sold","Product Unit Price","Sales Price Per Unit","Profit Amount");
				else
					System.out.println("No Records Found");
				for(SalesReport obj:report)
				{
					String salesID=obj.getSalesID();
					SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yy");
					String salesDate=fmt.format(obj.getSalesDate());
					String productID=obj.getProductID();
					String productName=obj.getProductName();
					int qtySold=obj.getQuantitySold();
					double productUnitPrice=obj.getProductUnitPrice();
					double salesPricePerUnit=obj.getSalesPricePerUnit();
					double profitAmount=obj.getProfitAmount();
					System.out.format("%15s%15s%15s%15s%15d%15f%15f%15f\n",salesID,salesDate,productID,productName,qtySold,(float)productUnitPrice,(float)salesPricePerUnit,(float)profitAmount);
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}






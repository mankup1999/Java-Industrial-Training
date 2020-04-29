
package com.mile1.bean;

public class Student
{
	//Instance Varibales
	String name;
	int[] marks;
	//Default Constructor
	public Student()
	{
	}
	//Parametrized Constructor
	public Student(String name,int[] marks)
	{
		this.name=name;
		this.marks=marks;
	}

	//Getter and Setter Functions
	public void setName(String name)
	{
		this.name=name;
	}

	public void setMarks(int[] marks)
	{
		this.marks=marks;
	}

	public String getName()
	{
		return this.name;
	}

	public int[] getMarks()
	{
		return this.marks;
	}
}

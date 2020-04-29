
package com.mile1.service;

//Importing required classes
import com.mile1.bean.Student;
import com.mile1.exception.NullStudentException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullMarksArrayException;

public class StudentReport
{
	//Validation may throw the three exceptions
	public String validate(Student data) throws NullStudentException,NullNameException,NullMarksArrayException
	{
		if(data==null) //In case student data is missing
		{
			throw new NullStudentException();
		}
		else if((data.getName())==null) //In case Student name is missing
		{
			throw new NullNameException();
		}
		else if((data.getMarks())==null) //In case Student marks are missing
		{
			throw new NullMarksArrayException();
		}	

			return findGrade(data); //Calculate Grade if all the required data are available	
	}
	
	public String findGrade(Student data)
	{
		int[] marks=data.getMarks();
		int sum=0;
		//Calculations required to find the grade 
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
			if(marks[i]<35)
				return "F"; //If any of the subjects have less than 35--->"F" Grade
		}
		if(sum<=150)  //marks<=150-->"D" Grade
			return "D";
		else if(sum<=200) //150<marks<=200 --->"C" Grade
			return "C";
		else if(sum<=250) //200<marks<=250 --->"B" Grade
			return "B";
		else if(sum<=300)  //250<marks<=300 ---->"A" Grade
			return "A";

		return ""; //No situation of having marks>300
	}
}

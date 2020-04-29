
package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService
{
	public int findNumberOfNullMarks(Student[] data)
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null)  //Data must be non-null to check for marks
			{
				int[] marks=(data[i]).getMarks();
				if(marks==null) //null marks found
					count++;
			}
		}
		return count;
	}

	public int findNumberOfNullNames(Student[] data)
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null)  //Data must be non-null to check for names
			{
				String name=(data[i]).getName();
				if(name==null) //null names fouund
					count++;
			}
		}
		return count;
	}

	public int findNumberOfNullObjects(Student[] data)
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null) //null objects found
			{
				count++;
			}
		}
		return count;
	}
}

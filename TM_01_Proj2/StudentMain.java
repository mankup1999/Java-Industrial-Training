
package com.mile1.main;

//importing required classes 	
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentMain
{
	//Test on first input
	static Student[] data=new Student[4];
	static
	{
		for(int i=0;i<data.length;i++)
			data[i]=new Student();

		data[0]=new Student("Sekar",new int[]{35,35,35});
		data[1]=new Student(null,new int[]{11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
	}


	//Test on second input
	/*static Student[] data=new Student[8];
	static
	{
		data[0]=new Student("A1",new int[]{72,73,74});
		data[1]=new Student("B1",new int[]{75,76,77});
		data[2]=new Student("C1",new int[]{99,99,99});
		data[3]=new Student("C3",new int[]{100,100,99});
		data[4]=new Student("B2",new int[]{13,88,13});
		data[5]=new Student("C3",new int[]{14,14,99});
		data[6]=new Student("A2",new int[]{77,55,12});
		data[7]=new Student("A5",new int[]{13,88,13});
	}
	*/
	
	public static void main(String[] args)
	{
		//creating instances of StudentService and StudentReport classes
		StudentService studentService=new StudentService();
		StudentReport studentReport=new StudentReport();

		System.out.println("Grades Calculation:");

		String x=null;

		//Report generation for every student
		for(int i=0;i<data.length;i++)
		{
			try
			{
				x=studentReport.validate(data[i]);
			}
			catch(NullNameException e)
			{
				x="NullNameException occurred";
			}
			catch(NullMarksArrayException e)
			{
				x="NullMarksException occurred";
			}
			catch(NullStudentException e)
			{
				x="NullStudentException occurred";
			}
			//Final Grade Assigned
			System.out.println("GRADE="+x);
		}

		//Totalling Null values
		System.out.println("Number of Objects with Marks array as null="+studentService.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name as null="+studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entirely null="+studentService.findNumberOfNullObjects(data));

	}
	
}











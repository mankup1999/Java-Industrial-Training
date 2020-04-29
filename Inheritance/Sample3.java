class Person
{
	String name;
	String dateOfBirth;
	public Person(String name,String dateOfBirth)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}

	public void details()
	{
		System.out.println("\tName: "+name);
		System.out.println("\tD.o.B.: "+dateOfBirth);
	}
}

class Teacher extends Person
{
	int salary;
	String subject;
	public Teacher(String name,String dateOfBirth,int salary,String subject)
	{
		super(name,dateOfBirth);
		this.salary=salary;
		this.subject=subject;
	}
	public void details()
	{
		super.details();
		System.out.println("\tSalary: "+salary);
		System.out.println("\tSubject: "+subject);
	}
}

class Student extends Person
{
	int studentId;
	public Student(String name,String dateOfBirth,int studentId)
	{
		super(name,dateOfBirth);
		this.studentId=studentId;
	}

	public void details()
	{
		super.details();
		System.out.println("\tStudent ID: "+studentId);
	}
}

class CollegeStudent extends Student
{
	String collegeName;
	String yearOfStudy;
	public CollegeStudent(String name,String dateOfBirth,int studentId,String collegeName,String yearOfStudy)
	{
		super(name,dateOfBirth,studentId);
		this.collegeName=collegeName;
		this.yearOfStudy=yearOfStudy;
	}

	public void details()
	{
		super.details();
		System.out.println("\tCollege Name: "+collegeName);
		System.out.println("\tYear of study: "+yearOfStudy);
	}
}


public class Sample3
{
	public static void main(String[] args)
	{
		Person person=new Person("ABC1","01-JAN-1998");
		System.out.println("\nPerson object details:");
		person.details();

		Teacher teacher=new Teacher("ABC2","20-JUL-2001",120000,"Physics");
		System.out.println("\nTeacher object details:");
		teacher.details();

		Student student=new Student("ABC3","12-NOV-20007",12345);
		System.out.println("\nStudent object details:");
		student.details();
	
		CollegeStudent collegeStudent=new CollegeStudent("ABC4","14-JAN-1999",167376,"NIT-Agartala","fourth");
		System.out.println("\nCollegeStudent object details:");
		collegeStudent.details();


	}
}

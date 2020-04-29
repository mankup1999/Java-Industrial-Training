
class Employee extends Person
{
	double annualSalary;
	int year;
	String insuranceNumber;

	Employee(String name,double annualSalary,int year,String insuranceNumber)
	{
		super(name);
		this.annualSalary=annualSalary;
		this.year=year;
		this.insuranceNumber=insuranceNumber;
	}

	public void setName(String name)
	{
		super.setName(name);
	}
	public void setAnnualSalary(double annualSalary)
	{
		this.annualSalary=annualSalary;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setInsuranceNumber(String insuranceNumber)
	{
		this.insuranceNumber=insuranceNumber;
	}

	
	public String getName()
	{
		return super.getName();
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	public int getYear()
	{
		return year;
	}
	public String getInsuranceNumber()
	{
		return insuranceNumber;
	}
}

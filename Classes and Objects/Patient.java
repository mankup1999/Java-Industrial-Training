
public class Patient
{
	String patientName;
	double height;
	double weight;

	Patient(String patientName,double height,double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	
	public double computeBMI()
	{
		return weight/(height*height);
	}

	public static void main(String[] args)
	{
		Patient patient=new Patient("Ram",62.5,1.5);

		double bmi=patient.computeBMI();		

		System.out.println("BMI of the patient: "+bmi);
	}
}

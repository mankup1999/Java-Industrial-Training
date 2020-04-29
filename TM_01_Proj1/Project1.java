
/*   
	Tech Module: 1
	Project: 1   
 
*/



//Implementation starts from here
public class Project1
{
	public static void main(String[] args)
	{
		//Initializing arrays with the given values
		int[] emp_no_list={1001,1002,1003,1004,1005,1006,1007};
		String[] emp_name_list={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] join_date_list={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char[] desgn_code_list={'e','c','k','r','m','e','c'};
		String[] dept_list={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] basic_list={20000,30000,10000,12000,50000,23000,29000};
		int[] hra_list={8000,12000,8000,6000,20000,9000,12000};
		int[] it_list={3000,9000,1000,2000,20000,4400,10000};

		//Creating variables to store final results
		int emp_no=0;
		String emp_name="";
		String dept="";
		String desgn="";
		int salary=0;

		//Checking the consistency of command line arguments
		if(args.length==1)
		{
			int emp_id=Integer.parseInt(args[0]);
			int matching_index=whereIsEmpId(emp_id,emp_no_list); //index helps to find all other records of the employee

			//If no matching records found
			if(matching_index==-1)
				System.out.println("There is no employee with empid : "+emp_id);
			else
			{
				emp_no=emp_id;
				emp_name=emp_name_list[matching_index];
				char desgn_code=desgn_code_list[matching_index];
				dept=dept_list[matching_index];
				salary=basic_list[matching_index]+hra_list[matching_index]-it_list[matching_index];
			
				//Passing designation code to find the actual desgination and DA(to be added into the final salary)
				switch(desgn_code)
				{
					case 'e':desgn="Engineer";salary+=20000;break;
					case 'c':desgn="Consultant";salary+=32000;break;
					case 'k':desgn="Clerk";salary+=12000;break;
					case 'r':desgn="Receptionist";salary+=15000;break;
					case 'm':desgn="Manager";salary+=40000;break;
				}

			//Output
			System.out.println("Emp No. "+"Emp Name "+"Department "+"Designation "+"Salary");
			System.out.println(emp_no+" "+emp_name+" "+dept+" "+desgn+" "+salary);
				
			}
		}
	}

	public static int whereIsEmpId(int item,int[] list)
	{
		int n=list.length;
		for(int i=0;i<n;i++)
			if(item==list[i])
				return i;
		return -1;
	}
}







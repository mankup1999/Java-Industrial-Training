package wipro;

import java.util.*;

public class Employee {
	public String findName(ArrayList employees,String name){
		  String result="";
		  if(employees.contains(name)){
		   result="FOUND";
		  }else{
		   result="NOT FOUND";
		  }
		  return result;
		 }

}
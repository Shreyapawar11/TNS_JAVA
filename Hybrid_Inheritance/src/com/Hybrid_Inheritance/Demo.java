package com.Hybrid_Inheritance;
class Person{
	
	long phno;
    String name;
    
    public void PersonDetails()
    {
    	System.out.println(name+ " "+phno);
    }
}

class Employee extends Person
{
	int empid;
	String position;
	float salary;
	
	public void EmployeeDetails()
	{
		System.out.println(empid+" "+position+" "+salary);
	}
}

class Manager extends Employee
{
	String authority;
	
	public void managerauthority()
	{
		System.out.println(authority);
	}
}

class Client extends Person 
{
	String bond;
	String projects;
	
	public void clientdetails()
	{
		System.out.println();
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.EmployeeDetails();
		e.PersonDetails();
		
		Client c=new Client();
		c.clientdetails();
		c.PersonDetails();
		
		Manager m=new Manager();
		m.managerauthority();
		m.PersonDetails();
		

	}

}

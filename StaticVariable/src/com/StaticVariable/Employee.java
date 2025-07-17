package com.StaticVariable;

public class Employee {
	private int empid;
	private String name;
	
	// static variable
	static String compnayName="TNS";  // constant value

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	public void empData()
	{
		System.out.println("EmpId: "+empid+"EmpName: "+name+"Company: "+compnayName);
	}
	

}

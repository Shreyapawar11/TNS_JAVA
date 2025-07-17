package com.Multilevel_Inheritance;

public class Manager extends Employee{
	private int noofShares; 
	private String authority;
	
	public Manager(String name, long contactNo, String deptName, long baseSalary, int noofShares,String authority ) {
		super(name, contactNo, deptName, baseSalary);
		
		this.noofShares= noofShares;
		this.authority= authority;
	}

	public int getNoofShares() {
		return noofShares;
	}

	public void setNoofShares(int noofShares) {
		this.noofShares = noofShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Manager [noofShares=" + noofShares + ", authority=" + authority + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}

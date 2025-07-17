package com.Multilevel_Inheritance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Sujal", 9876543321L);
		System.out.println(p1);
		
		p1 = new Employee("Shreya", 9087921234L,"Sales", 67890);
		System.out.println(p1);
		
		p1= new Manager("Sayali",8976543219L,"IT",100000,100,"Signning Authority");
		System.out.println(p1);
		
	}

}

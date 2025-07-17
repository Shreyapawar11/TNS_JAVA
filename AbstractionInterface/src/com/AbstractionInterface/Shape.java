package com.AbstractionInterface;

abstract public class Shape {
	protected float area;
	
	//abstract method
	abstract void calArea();
	
	//concrete methods
     void show()
	{
		System.out.println("Area of the Shape is "+area);
	}
     
	

}

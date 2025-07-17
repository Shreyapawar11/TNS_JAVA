package com.Methods;

public class MethodsDemo {

	int m=23;
	
	public void addition()
	{
		int x=20;
		int y=10;
		int add=x+y;
		System.out.println("Addition of X and Y is "+ add);
		System.out.println(m);
	}
	
	public void multiply(int a, int b)
	{
		int mult = a*b;
		System.out.println("Multiplication of a and b is "+ mult);
		//System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo obj1 = new MethodsDemo(); //object creation
		obj1.addition(); //method calling
		obj1.multiply(19, 2);
	}

}

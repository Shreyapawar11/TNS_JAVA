package com.FinalKeyword;

final class FinalClass {
	void show()
	{
		System.out.println("Value of a: ");
	}
}

public class FinalClassDemo {
	// for this to execute this class has to be in seperate class
	// ❌ Cannot inherit from final class
	//use final class obj 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinalClass obj = new FinalClass();
	        obj.show();
	}

}

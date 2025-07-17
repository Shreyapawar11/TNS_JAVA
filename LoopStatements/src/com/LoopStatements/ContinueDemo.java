package com.LoopStatements;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
		{
			//odd numbers are skipped
			if(i%2 != 0)
			{
				continue;
			}
			//even numbers are printed
			System.out.println(i);
		}

	}

}

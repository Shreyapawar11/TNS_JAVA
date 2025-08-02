package com.Assignment5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String InputString = sc.nextLine();
		
		StringBuffer lowercaseString = new StringBuffer();
		StringBuffer uppercaseString = new StringBuffer();
		
		for (char c : InputString.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				uppercaseString.append(c);
			}
			else
			{
				lowercaseString.append(c);
			}
		}
		System.out.println(lowercaseString.toString() + uppercaseString.toString());

	}

}

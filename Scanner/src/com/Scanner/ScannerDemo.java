package com.Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();
		System.out.println("ID = "+id);
		
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Name = "+ name);
	}

}

package com.ConditionalStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char x = 0;
		
		switch(x)
		{
		case 'l':
			System.out.println("This code contains letters");
			break;
			
		case 'd':
			System.out.println("This code contains digits");
			break;
			
		case 's':
			System.out.println("This code contains symbol");
			break;
			
		case 'w':
			System.out.println("This code contains white-spaces");
			break;
			
		default:
			System.out.println("This code doesn't contain any letter, symbol, digit or whitespace");
			break;
		}
	}

}

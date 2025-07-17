package MethodOverriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an array of shape objects
		
		Shape[] shapes = new Shape[2];
		
		// instantiate objetcs of circle, square.
		shapes[0]= new Circle(5.0);
		shapes[1]= new Square(6.0);
		
		//Demonstrate polymorphism by calling draw and erase methods
		
		for(Shape s:shapes)
		{
			s.draw();
			s.erase();
			System.out.println("----------------------");
		}
	}

}

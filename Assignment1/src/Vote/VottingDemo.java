package Vote;
import java.util.Scanner;
public class VottingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id = ");
	    int a = sc.nextInt();
	    if (a>18)
	    {
	    	System.out.println("A is eligible");
	    }
	    else
	    {
	    	System.out.println("A is not eligible");
	    }

	}

}


public class ConstructorsDemo {
	int Id;
	String name;
	int Age;
	
	public void setId(int Id)
	{
		this.Id= Id;
	}
	
	public int getId()
	{
		return Id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int Age)
	{
		this.Age=Age;
	}
	
	public int getAge()
	{
		return Age;
	}

    public ConstructorsDemo()
    {
    	System.out.println("default constructor");
    }
    public ConstructorsDemo(int Id, String name, int Age)
    {
    	System.out.println("Parameterised Constructor");
    	System.out.println(" Id= "+ Id +" Name= "+ name + " Age= " + Age);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsDemo obj1 = new ConstructorsDemo();
		ConstructorsDemo obj2 = new ConstructorsDemo(123, "shreya", 21);

	}

}

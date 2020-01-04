package blocks;

public class StaticBlock 
{
	
	public static void main(String[] args)	// main executed at end
	{
		System.out.println("main method");
		System.out.println(name + " " + lastName);
	}	
	
	// sequential execution of static block & static variables
	// runs only once
	static String name;	
	
	static	// won't run without main method	 
	{
		System.out.println("static block");
		System.out.println(name);
//		System.out.println(lastName);	does not exist at this level
		lastName = "Parent";
		
	}
	static
	{
		System.out.println("name initialization");
		name = "Child";
		lastName = "Parent GParent";
	}
	
	static String lastName;	
}

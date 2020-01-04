package inheritance;

class ParentInheritanceMethCls
{
	public static void fam() 
	{
		System.out.println("India");
	}
	public static void name() 
	{
		System.out.println("Parent");
	}
}

public class InheritanceMethCls extends ParentInheritanceMethCls
{
	public static void name() 
	{
		System.out.println("Child");
	}
	/*	 
	 * instance method cannot override static method
	 * public void name()	 
	 * { 
	 * System.out.println("Name"); 
	 * }
	 */	
	public static void main(String[] args) {
		fam();
		name();
	}
}

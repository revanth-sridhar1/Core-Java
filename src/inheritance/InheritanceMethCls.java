package inheritance;

class ParentInheritanceMethCls
{
	public static void fam() 
	{
		System.out.println("Thanjavur");
	}
	public static void name() 
	{
		System.out.println("Sridhar");
	}
}

public class InheritanceMethCls extends ParentInheritanceMethCls
{
	public static void name() 
	{
		System.out.println("Revanth");
	}
	/*	 
	 * instance method cannot override static method
	 * public void name()	 
	 * { 
	 * System.out.println("Chotu"); 
	 * }
	 */	
	public static void main(String[] args) {
		fam();
		name();
	}
}

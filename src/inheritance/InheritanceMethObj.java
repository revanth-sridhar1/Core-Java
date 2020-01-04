package inheritance;

class ParentInheritanceMethObj 
{
	public void name() 
	{
		System.out.println("Sridhar");
	}
	public void mother() 
	{
		System.out.println("Nalini");
	}
	public static void company() 
	{
		System.out.println("Hp");
	}
}

public class InheritanceMethObj extends ParentInheritanceMethObj
{
	public void name() 
	{
		System.out.println("Revanth");
	}
	/*
	 * static method cannot hide instance method
	 * public static void name() 
	 * { 
	 * System.out.println("Chotu");	
	 * }
	 */
	public void wife() {
		System.out.println("Akila");
	}
	public static void company() {
		System.out.println("Morgan");
	}
	/*	
	 * instance method cannot override static method
	 * public void company() 
	 * { 
	 * System.out.println("Google"); 
	 * }
	 */
	
	public static void main(String[] args) 
	{
		InheritanceMethObj im = new InheritanceMethObj();
		im.name();
		im.wife();
		im.mother();
		im.company();
		
		ParentInheritanceMethObj pim = new ParentInheritanceMethObj();
		System.out.println();
		pim.name();
		pim.mother();
		pim.company();
		
		ParentInheritanceMethObj pc = new InheritanceMethObj();
		System.out.println();
		pc.name();
		pc.mother();
		pc.company();
	}
}

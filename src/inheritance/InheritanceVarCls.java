package inheritance;

class ParentInheritanceVarCls
{
	static String fam = "India";
	static String name = "Parent";
}

public class InheritanceVarCls extends ParentInheritanceVarCls
{
	static String name = "Child";
	
	public static void main(String[] args) 
	{
		System.out.println(fam); 
		System.out.println(name);
	}
}

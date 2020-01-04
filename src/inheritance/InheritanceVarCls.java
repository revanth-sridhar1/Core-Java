package inheritance;

class ParentInheritanceVarCls
{
	static String fam = "Thanjavur";
	static String name = "Sridhar";
}

public class InheritanceVarCls extends ParentInheritanceVarCls
{
	static String name = "Revanth";
	
	public static void main(String[] args) 
	{
		System.out.println(fam); 
		System.out.println(name);
	}
}

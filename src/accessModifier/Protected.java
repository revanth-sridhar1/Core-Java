package accessModifier;

class GrandParentProtected
{
	protected String grandName = "Kasi";
}

class ParentProt extends GrandParentProtected
{
	protected String parentName = "Sridhar";
}

public class Protected extends ParentProt	
{
	protected String childName = "Revanth";
	
	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println("GrandParent : " + p.grandName);
		System.out.println("Parent      : " + p.parentName);
		System.out.println("Child       : " + p.childName);
	}
}

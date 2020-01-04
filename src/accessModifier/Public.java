package accessModifier;

class GrandParentPublic
{
	public String grandName = "Kasi";
}

class ParentPublic extends GrandParentPublic
{
	public String parentName = "Sridhar";
}

public class Public extends ParentPublic	
{
	public String childName = "Revanth";
	
	public static void main(String[] args) {
		Public p = new Public();
		System.out.println("GrandParent : " + p.grandName);
		System.out.println("Parent      : " + p.parentName);
		System.out.println("Child       : " + p.childName);
	}
}

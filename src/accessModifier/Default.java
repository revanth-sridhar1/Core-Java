package accessModifier;

class GrandParentDefault 
{
	String grandName = "Kasi";
}

class ParentDefault extends GrandParentDefault
{
	String parentName = "Sridhar";
}

public class Default extends ParentDefault
{
	String childName = "Revanth";
	
	public static void main(String[] args) {
		Default d = new Default();
		System.out.println("GrandParent : " + d.grandName);
		System.out.println("Parent      : " + d.parentName);
		System.out.println("Child       : " + d.childName);
	}
}

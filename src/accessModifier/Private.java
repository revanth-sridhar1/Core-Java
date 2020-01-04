package accessModifier;

class GrandParentPrivate
{
	private String grandName = "Kasi";
	
	public String getGrandName() {
		return grandName;
	}
}

class ParentPrivate extends GrandParentPrivate
{
	private String parentName = "Sridhar";
	
	public String getParentName() {
		return parentName;
	}
}

public class Private extends ParentPrivate
{
	private String childName = "Revanth";
	
	public static void main(String[] args) {
		Private p = new Private();
//		System.out.println("GrandParent : " + p.grandName);
//		System.out.println("Parent      : " + p.parentName);
		System.out.println("GrandParent : " + p.getGrandName());
		System.out.println("Parent      : " + p.getParentName());
		System.out.println("Child       : " + p.childName);
	}
}

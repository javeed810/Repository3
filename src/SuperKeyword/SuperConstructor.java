package SuperKeyword;

public class SuperConstructor {
	public SuperConstructor() {
System.out.println("Parent constructor");
	}
}
class Dogy extends SuperConstructor
{
	public Dogy() {
		super();
System.out.println("Child constructor");
	}
}
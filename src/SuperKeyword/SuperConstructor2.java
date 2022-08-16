package SuperKeyword;

public class SuperConstructor2 {
	public SuperConstructor2() {
		System.out.println("Parent constructor-->");
	}
}
class Doggg extends SuperConstructor2{
	public Doggg() {
		System.out.println("Child constructor--->");
	}
}
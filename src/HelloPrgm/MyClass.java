package HelloPrgm;

public class MyClass extends AbstractClss
{
	public void display() {
		System.out.println("Abtract method implementation");
	}
	public static void main(String[] args) {
		AbstractClss obj=new MyClass();
		obj.display();
	}
}

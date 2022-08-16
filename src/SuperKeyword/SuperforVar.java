package SuperKeyword;

public class SuperforVar {
	String color="White";
}
class Dog extends SuperforVar
{
	String color="Black";
	void display() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

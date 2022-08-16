package SuperKeyword;

public class SuperAnimal {
	void eat() {
		System.out.println("Animal eats");
	}
}
class Dogg extends SuperAnimal
{
	void eat() {
		System.out.println("Dog eats");
		super.eat();
	}
}

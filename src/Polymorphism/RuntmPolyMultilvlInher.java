package Polymorphism;

public class RuntmPolyMultilvlInher {
	void eat() {
		System.out.println("Eating...");
	}

}
class Dog extends RuntmPolyMultilvlInher{
	void eat() {
		System.out.println("Dog is eating");
	}
}
class Cat extends Dog{
	void eat() {
		System.out.println("Cat is eating");
	}
}

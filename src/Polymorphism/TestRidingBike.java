package Polymorphism;

public class TestRidingBike extends MethodOverriding{
	void run() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		TestRidingBike t=new TestRidingBike();//Bike is running
		//MethodOverriding t=new TestRidingBike();//Bike is running
		t.run();
	}
}
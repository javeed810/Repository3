package Polymorphism;

public class MethodOverloading1 {//changing the data type of arguments
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverloading1.add(2.2, 3.0));
		System.out.println(MethodOverloading1.add(2, 2));
	}
}

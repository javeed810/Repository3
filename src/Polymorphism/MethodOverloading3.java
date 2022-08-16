package Polymorphism;

public class MethodOverloading3 {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverloading3.add(2, 2));//ambiguity which method to call
		System.out.println(MethodOverloading3.add(3, 2));
	}

}

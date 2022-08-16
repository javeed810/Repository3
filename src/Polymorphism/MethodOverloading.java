package Polymorphism;

public class MethodOverloading {//changin the number of parameters
	static int add(int i,int j) {
		return i+j;
	}
	static int add(int i,int j,int k) {
		return i+j+k;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(2, 2));
		System.out.println(MethodOverloading.add(2, 2,2));
	}

}

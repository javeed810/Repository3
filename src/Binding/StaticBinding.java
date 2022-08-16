package Binding;

public class StaticBinding {
	private void m1() {//if there is any private,static,final methods in a class there is static binding
		System.out.println("Private m1 method");
	}
	public static void main(String[] args) {
		StaticBinding s1=new StaticBinding();
		s1.m1();
	}

}

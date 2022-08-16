package Binding;

public class DynamicBindingTest extends DynamicBinding{
		void m1() {
			System.out.println("method m1 child class");
		}
		public static void main(String[] args) {
			DynamicBindingTest d=new DynamicBindingTest();
			d.m1();
		}
	}
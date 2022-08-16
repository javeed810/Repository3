package MethodOvrdngAccessMod;

public class TestM1 {
	public static void main(String[] args) {
		MethodOvr1 t=new MethodOvr1();
		System.out.println(t.m1());//Compile time error method is private
	}

}

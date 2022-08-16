package MethodOvrdngAccessMod2;
import MethodOvrdngAccessMod.ProtectedClssmembrs;
public class TestProtected extends ProtectedClssmembrs{
	public static void main(String[] args) {
		TestProtected t=new TestProtected();
		t.m4();
		System.out.println(t.b);
	//	System.out.println(t.a);//compile time error bcz a is private
	}

}

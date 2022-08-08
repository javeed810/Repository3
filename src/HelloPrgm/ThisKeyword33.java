package HelloPrgm;

public class ThisKeyword33 {
	void m() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThisKeyword33 t3=new ThisKeyword33();
		System.out.println(t3);
		t3.m();
	}

}

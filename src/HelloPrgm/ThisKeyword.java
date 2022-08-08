package HelloPrgm;

public class ThisKeyword {
	void m() {
		System.out.println("Hello m");
	}
	void n() {
		System.out.println("Hello n");
		m();
	}
	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword();
		t.m();
		t.n();
	}
	
}

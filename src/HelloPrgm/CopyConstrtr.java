package HelloPrgm;

public class CopyConstrtr {
	int rollNo;
	String name;
	public CopyConstrtr(int r,String n) {
		rollNo=r;
		name=n;
	}
	public CopyConstrtr(CopyConstrtr c) {
		rollNo=c.rollNo;
		name=c.name;
	}
	void display() {
		System.out.println(rollNo+" "+name);
	}
	public static void main(String[] args) {
		CopyConstrtr c1=new CopyConstrtr(1001, "Haneef");
		CopyConstrtr c2=new CopyConstrtr(1001, "Junaid");
		CopyConstrtr c3=new CopyConstrtr(c2);
		c1.display();
		c2.display();
		c3.display();
	}

}

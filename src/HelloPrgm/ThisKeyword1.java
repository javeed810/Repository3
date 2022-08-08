package HelloPrgm;

public class ThisKeyword1 {
	int rollNo;
	String name,course;
	float fee;
	public ThisKeyword1(int rollNo,String name, String course) {
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	ThisKeyword1(int rollNo,String name, String course,float fee){
		this(rollNo, name, course);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollNo+" "+name+" "+course+" "+fee);
	}
	public static void main(String[] args) {
		ThisKeyword1 t1=new ThisKeyword1(001, "javeed", "CS");
		ThisKeyword1 t2=new ThisKeyword1(001, "Ahmed", "CS",32000f);
		t1.display();
		t2.display();
		
	}

}

package SuperKeyword;

public class SuperEx {
	int id;
	String name;
	public SuperEx(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
class Employee extends SuperEx
{
	float salary;
	public Employee(int id, String name,float salary) {
		super(id, name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

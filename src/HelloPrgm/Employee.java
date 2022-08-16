package HelloPrgm;

public class Employee {
	int id;
	String name;
	AddressEmp address;
	public Employee(int id,String name,AddressEmp address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		AddressEmp address1=new AddressEmp("Bangalore", "Karnataka", "India");
		AddressEmp address2=new AddressEmp("Bhatkal", "Karnataka", "India");
	Employee e=new Employee(1001, "haneef", address1);
	Employee e1=new Employee(1002, "junaid", address2);
	e.display();
	e1.display();
	}
}

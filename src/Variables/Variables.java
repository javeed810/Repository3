package Variables;

public class Variables {
	static int Var1=100;
	 void m1() {
		int var2=200;
		System.out.println(var2);
		
	}
	public static void main(String[] args) {
		int var3=300;
		Variables var=new Variables();
		System.out.println(var.Var1);
		System.out.println(var3);
		var.m1();
		
	}
	

}

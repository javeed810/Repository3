package Polymorphism;

public class TestBank {
	public static void main(String[] args) {
		
	Bank b=new Bank();
	Bank b1=new SBI();
	Bank b2=new Axis();
	Bank b3=new ICICI();
	System.out.println("Bank "+b.rateOfInterest());
	System.out.println("Bank SBI "+b1.rateOfInterest());
	System.out.println("Bank Axis "+b2.rateOfInterest());
	System.out.println("Bank ICICI "+b3.rateOfInterest());
	}
}

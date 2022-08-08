package HelloPrgm;

public class BankingSystem {
	int acc_No;
	String name;
	float amount;
	void insert(int acc,String name,float amt)
	{
		this.acc_No=acc;
		this.name=name;
		this.amount=amt;
	}
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+" deposited");
	}
	void withdraw(float amt)
	{
		if(amt>amount)
		{
			System.out.println("inufficient");
		}
		else
		{
			amount=amount=amt;
			System.out.println(amt+" withdrawn");
		}
	}
	void checkBalance() {
		System.out.println(amount);
	}
	void displayAcc() {
		System.out.println(acc_No+" "+name+" "+amount);
	}
	public static void main(String[] args) {
		BankingSystem b1=new BankingSystem();
		BankingSystem b2=new BankingSystem();
		BankingSystem b3=new BankingSystem();
		b1.insert(1001, "haneef", 500);
		b2.insert(1001, "junaid",1000);
		b3.insert(1003, "pavan", 200);
		b1.displayAcc();
		b2.deposit(300);
		b2.checkBalance();
		b3.withdraw(400);
		b1.displayAcc();
	}
}

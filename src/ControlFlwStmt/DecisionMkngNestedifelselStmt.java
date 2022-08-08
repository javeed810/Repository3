package ControlFlwStmt;

public class DecisionMkngNestedifelselStmt {
	public static void main(String[] args) {
		String city="Delhi,india";
		if(city.endsWith("india"))
		{
			if(city.contains("Meerut"))
			{
				System.out.println("Meerut");
			}
			else if(city.contains("Noida"))
			{
				System.out.println("Noida");
			}
			else
			{
				System.out.println(city.split(",")[0]);
			}
		}else
			{
				System.out.println("not in india");
			}
		}
	}


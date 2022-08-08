package anonymousObj;

public class AnonymousObj{  
 void fact1(int  n)
 	{  
	 int fact=1;  
	 for(int i=1;i<=n;i++)
	 	{  
		 	fact=fact*i;  
	 	}  
 	
	 System.out.println("factorial is "+fact);  
 	}  
public static void main(String args[]){  
 new AnonymousObj().fact1(5);//calling method with anonymous object  
}  
}  
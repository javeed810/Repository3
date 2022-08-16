package InstanceIntzrBlock;

public class IIB2 {
	IIB2(){
		System.out.println("IIB2 constructor");
	}
}
class BB extends IIB2{
	BB(){
		System.out.println("BB class constructor");
	}
	BB(int a){
		System.out.println("BB constructor with argument "+a);
	}
	{
		System.out.println("Instance initializer block");
	}
}
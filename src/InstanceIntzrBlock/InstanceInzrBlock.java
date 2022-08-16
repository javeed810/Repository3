package InstanceIntzrBlock;

public class InstanceInzrBlock {
	public InstanceInzrBlock() {
		System.out.println("Parent class constructor");
	}
}
class B extends InstanceInzrBlock 
{
	B(){
		System.out.println("Child class constructor");
	}
	{
		System.out.println("Instance initializer block");
	}
}

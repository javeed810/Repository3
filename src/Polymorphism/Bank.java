package Polymorphism;

public class Bank {
	int rateOfInterest() {
		return 0;
	}
}
 class SBI extends Bank{
	int rateOfInterest() {
		return 8;
	}
}
 class Axis extends Bank{
	 int rateOfInterest() {
		 return 9;
	 }
 }
 class ICICI extends Bank{
	 int rateOfInterest() {
		 return 10;
	 }
 }
 
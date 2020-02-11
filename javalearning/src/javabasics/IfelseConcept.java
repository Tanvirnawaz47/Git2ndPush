package javabasics;

public class IfelseConcept {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	if(b>a) {
System.out.println("b is greater than a");
	}
	else {
		System.out.println("a is greater than b");
	}
	int c=40;
	int d=40;
	if (c==d) {
		System.out.println("c and d are equal");
	}
	else {
		System.out.println("c and d are not equal");
	}
	
	// printing out the highest number
	int x=100;
	int y=200;
	int z=300;
	//nested if-else
	if (x>y & x>z) {
		System.out.println("x is the greatest");
	}
	else if(y>z) {
		System.out.println("y is the greatest");
	}
	else {
		System.out.println("z is the greatest value");
	}
	System.out.println("and the greatest value is:"+300);
	
	
	
	
	
	
}
}
package javabasics;

public class StringConcatenation {

	public static void main(String[] args) {
		int a=100; 
		int b=200;
		String x= "hello";
		String y="world";
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//-->answer: helloworld100200; do not add 100+200=300!!!
		
		System.out.println(a+b+(x+y));
		System.out.println(x+y+(a+b));
		
		// if you write string before numbers then numbers doesn't get added
		
		System.out.println("the value of b is:"+ 200);
		
		
		
	}

}

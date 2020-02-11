package classConcepts;

public class StaticAndnonStaticconcept {
	String name="tom";//non static global variable
	static int age=25;//static global variable
	public static void main(String[] args) {// how to call static method and variable?
		sum();// direct
		StaticAndnonStaticconcept.sum();//calling by classname
		System.out.println(age);
		System.out.println(StaticAndnonStaticconcept.age);
		//how to call non static methods and variables?
		
		StaticAndnonStaticconcept obj=new StaticAndnonStaticconcept();
		obj.sendmail();
		System.out.println(obj.name);
	}
	
	public void sendmail() {// non static method
		System.out.println("send mail method");
		
	}
public static void sum() {//  static method
	System.out.println("sum method");
	
	
	
	
	
	
}
}

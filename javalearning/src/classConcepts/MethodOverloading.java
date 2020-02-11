package classConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();	// obj is referring the particular method
	obj.sum();
	obj.sum(10);
	obj.sum(10,5);
	
	}
	
	
	
	public void sum() {// zero input parameter
		System.out.println("sum method");
		
	}
	
	public void sum(int i) {// one input parameter
		System.out.println("sum method");
		
	}
	public void sum(int k, int l) {// two input parameter
		System.out.println("sum method");
		
	}
	
	
}

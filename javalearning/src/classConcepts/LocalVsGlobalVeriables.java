package classConcepts;

public class LocalVsGlobalVeriables {
	//the variables which mentioned after class are global variables or class variables
	String name="tom";
	int age=25;
	
	public static void main(String[] args) {
		
int i=10;//local variables are writhin inside the main method
LocalVsGlobalVeriables obj= new LocalVsGlobalVeriables();
System.out.println(obj.name);
System.out.println(obj.age);


	}
public void sum() {
	int i=15;//this i is a local variable for sub method
	int j=20;
	int age=25;// these three variables are local variables
}
	
	
	
	
	
}

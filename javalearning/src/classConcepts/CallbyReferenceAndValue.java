package classConcepts;

public class CallbyReferenceAndValue {
	int p;
	int q;

	public static void main(String[] args) {
		CallbyReferenceAndValue obj= new CallbyReferenceAndValue();
		int x=10;
		int y=20;
		obj.testsum(x, y);//call by value or pass by value
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		//after swap 
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int testsum(int a, int b) {
		a=30;
		b=40;
		
		int c=a+b;
		
		return c;
	}

	public void swap(CallbyReferenceAndValue t) {
		int temp;// call by references
		temp= t.p;// temp=50
		t.p=t.q;//t.p=60
		t.q=temp;//t.q=50
	}
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	



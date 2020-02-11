package classConcepts;

public class functionsInJava {

	public static void main(String[] args) {
		functionsInJava obj=new functionsInJava();
//one object will be created, obj is the reference variable,referring to this object
		// after creating the object, the copy of non static methods will be given to this object
		obj.test();
	int l=	obj. pqr();
		System.out.println(l);
		String s1=obj.qa();
		System.out.println(s1);
		int div=obj.division(30, 10);
		System.out.println(div);
		
	}
	public void test() {
		System.out.println("test method");
		
		
	}
	//public void pqr() {
		//int a=10;
		//int b=20;
		//int c=a+b;
		//return c;
		//the function has void which means "doesn't return any value"// 
	//again we are returning integer value so we have to change method into int and remove VOID	
		public int pqr() {
			int a=10;
			int b=20;
			int c=a+b;
			return c;
		
	}
		public String qa() {
			System.out.println("qa method");
			String s= "selenium";
			return s;
		}
		//x,y- input parameters or arguments
		public int division(int x, int y) {
			System.out.println("division method");
			int d=x/y;
			return d;// void had to change with int because return type of this method was int
		}

}

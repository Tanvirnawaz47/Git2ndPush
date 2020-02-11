package classConcepts;

public class wrapperClassConcept {

	public static void main(String[] args) {
		String x="100";// 100 is double quoted hence will be treated as STRING not INT
		System.out.println(x+20);// result 10020-->remember String concatenation
//convert this string into integer using wrapper class concept
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		//integer,double,character,boolean
		
		//string to double conversion
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//string to character conversion// character doesn't have parseInt method
		//String n="tanvir";
		////Character.parseCharacter(n);
		//System.out.println();
		
		String k="true";
		Boolean.parseBoolean(k);
		System.out.println(k);
		
		//int to string conversion
		int j=20;
		System.out.println(j+20);
		String m=String.valueOf(j);
		System.out.println(m+20);// result 2020 because this is string concatenation
		
		
		
		
		
		
		
		
	}

}

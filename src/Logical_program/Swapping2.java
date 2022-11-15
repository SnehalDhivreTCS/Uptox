package Logical_program;

public class Swapping2 {
	
	public static void main(String[] args) {
		int a = 50;
		int b = 10;
		System.out.println(a + "and"+ b);
		
	/*	// using 3rd variable
		int c = a;  //50
		    a = b;   // 10
		    b = c;  //50  */
		
		
		a = a+b;  //50+10=60
		b = a-b;   //60-10 =50
		a = a-b; // 60-50 =10
		
		System.out.println(a + "and" + b);   

		
	}

}

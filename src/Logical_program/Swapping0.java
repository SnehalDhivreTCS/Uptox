package Logical_program;

public class Swapping0 {
	
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		System.out.println(a +"and" + b);
		
	/*	// using 3rd varible 
		
		int c = a;
		    a = b; 
		    b =c ;
		    
		    System.out.println(a +"and" + b);  */
		
		
		a = a+b ;   //20+10 =30
		b = a -b; // 30-10 =20
		a = a- b ; // 30-20 =10
		
		System.out.println(a +"and" + b);
		
	}

}

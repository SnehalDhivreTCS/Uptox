package Logical_program;

public class Swapping____8 {
   public static void main(String[] args) {
	 int a = 10; 
	 int b = 20;
	 System.out.println(a + "and"+ b);
	 
  /*	 int c = a;
	     a= b;
	     b= c;
	     
	     System.out.println(a +"and"+ b);   */
	 
	 a = a+b; // 30
	 b = a-b; // 30-20=10
	 a = a-b ; // 30-10 =10;
	 
	 System.out.println(a +"and" +  b);
	     
}

}

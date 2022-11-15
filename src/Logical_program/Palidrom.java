package Logical_program;

public class Palidrom {
	 public static void main(String[] args) {
		
	String org = "ANNA";
	String rev = "" ;
	for(int i =org.length()-1; i>=0; i--) {
		rev = rev+org.charAt(i);	
	}
	
	System.out.println(rev);
	
	// given word is palidrome or not 
	if(org.equals(rev)) {
		System.out.println("palidrome word");
	}
	else {
		System.out.println("not palidrome");
	}
	 }
}

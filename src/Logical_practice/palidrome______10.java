package Logical_practice;

public class palidrome______10 {
	
	public static void main(String[] args) {
		String org = "NITIN";
		String rev = "";
		for(int i =org.length()-1; i>=0; i--) {
			rev = rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("palidrome word");
		}
		else {
			System.out.println("not palidrome");
		}
	}

}

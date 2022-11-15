package Logical_program;

public class Revers {
	
	public static void main(String[] args) {
		String org = "ROHII";
		String rev = "";
		for(int i=org.length()-1; i>=0; i--) {
			rev = rev +org.charAt(i);
		}
		System.out.println(rev);
	}

}

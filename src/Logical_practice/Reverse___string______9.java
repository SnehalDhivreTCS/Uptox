package Logical_practice;

public class Reverse___string______9 {
	
	public static void main(String[] args) {
		String org = "SUMEDH";
		String rev = "";
		for(int i =org.length()-1; i>=0; i--) {
			rev =rev+org.charAt(i);
		}
		
		System.out.println(rev);
	}

}

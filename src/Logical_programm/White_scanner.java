package Logical_programm;

import java.util.Scanner;

public class White_scanner {
	
	public static void main(String[] args) {
		Scanner sn =  new Scanner(System.in);
		
		 String num = sn.nextLine();
		 int count =0;
		 for(int i =0; i<=num.length()-1; i++) {
			 char v = num.charAt(i);
			 if(v ==' ') {
				count++; 
			 }
		 }
		 System.out.println(count );
	}
	
	

}

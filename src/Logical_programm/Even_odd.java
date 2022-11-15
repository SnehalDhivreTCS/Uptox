package Logical_programm;

import java.util.Scanner;

public class Even_odd {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		 int num = sn.nextInt();
		 
		 if(num%2==0) {
			 System.out.println("Even no");
		 }
		 else {
			 System.out.println("odd no");
		 }
	}

}

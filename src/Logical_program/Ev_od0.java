package Logical_program;

import java.util.Scanner;

public class Ev_od0 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("even no");
		}
		else {
			System.out.println("odd no");
		}
	}

}

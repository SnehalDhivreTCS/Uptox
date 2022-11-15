package Logical_program;

import java.util.Scanner;

public class Take_input_from_user {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		
		System.out.println(num+num1);
		
		String name = scan.next();
		System.out.println(name);
	}

}

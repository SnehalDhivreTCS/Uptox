package Logical_practice;

import java.util.Scanner;

public class Whitespacess_scanner {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		 int count = 0;
		for(int i=0; i<=name.length()-1; i++) {
			char v = name.charAt(i);
			if(v==' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}

package Logical_programm;

import java.util.Scanner;

public class Wh__sacnner {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		String name = sn.nextLine();
		
		int count = 0;
		for(int i =0; i<=name.length()-1; i++) {
			char v = name.charAt(i);
			if(v ==' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	

}

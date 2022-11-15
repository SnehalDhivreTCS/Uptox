package Logical_programm;

import java.util.Scanner;

public class Replace_multiple_chr {
	
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		String name = sn.next();
	String correct = name.replaceAll("[a-zA-z]", "");
	System.out.println(correct);
		
	}

}

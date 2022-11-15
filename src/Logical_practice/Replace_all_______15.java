package Logical_practice;

import java.util.Scanner;

public class Replace_all_______15 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		String coreect = name.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(coreect);
	}

}

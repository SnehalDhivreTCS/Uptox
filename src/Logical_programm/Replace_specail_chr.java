package Logical_programm;

import java.util.Scanner;

public class Replace_specail_chr {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String name = sn.next();
	   String correctname = name.replace("@", "A");
	   System.out.println(correctname);
	}

}

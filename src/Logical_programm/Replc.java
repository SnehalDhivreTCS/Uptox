package Logical_programm;

import java.util.Scanner;

public class Replc {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String name = sn.next();
		String correct = name.replace("#","H");
		System.out.println(correct);
	}

}

package Logical_program;

public class Factorial2 {
	public static void main(String[] args) {
		int num = 2;
		int fact = 1;
		for(int i =1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}

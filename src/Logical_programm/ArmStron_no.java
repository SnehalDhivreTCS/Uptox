package Logical_programm;

public class ArmStron_no {
	
	public static void main(String[] args) {
		int num = 243;
		int actno = num ;
		int r = 0;
		int armno= 0;
		
		while(num>0) {
			r=num%10;
			armno = r*r*r+armno;
			num =num/10;
		}
		
		if(actno==armno) {
			System.out.println("Armstrog no");
		}
		else {
			System.out.println("not arm no");
		}
	}

}

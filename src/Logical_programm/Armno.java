package Logical_programm;

public class Armno {
	
	public static void main(String[] args) {
		
		int num =153;
		int actno = num;
		int r =0;
		int armno =0;
		
		while(num>0) {
			r=num%10;   //exctract no
			armno =r*r*r+armno;
			num=num/10;
		}
        if(armno==actno) {
        	System.out.println("arm no");
        }
        else {
        	System.out.println("not arm no");
        }
	}
}

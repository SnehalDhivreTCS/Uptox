package Logical_practice;

public class Armstrong_no____17 {
	
	
	public static void main(String[] args) {
		int num =153;
		int actno =num;
		int r =0;
		int armno=0;
		
		while(num>0) {
			r=num%10;
			armno=r*r*r+armno;
			num=num/10;
		}
		if(actno ==armno) {
			System.out.println("Arm no ");
		}
		else{
			System.out.println("not Arm no");
		}
	}

}

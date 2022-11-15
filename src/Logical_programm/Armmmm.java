package Logical_programm;

public class Armmmm {
	
	public static void main(String[] args) {
		int num = 153;
		int actnum = num;
		int r = 0;
		int armno=0;
		
		while(num>0) {
			r=num%10;
			armno=r*r*r+armno;
			num=num/10;
		}
		if(actnum==armno) {
			System.out.println("armstrong no");
		}
		else {
			System.out.println("not armstrong no");
		}
	}

}

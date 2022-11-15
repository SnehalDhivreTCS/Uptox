package Logical_program;

public class Prime_No {
	
	public static void main(String[] args) {
		int i = 0;
		int num=0;
		String PrimeNos= " ";
		for(i=1; i<=20; i++) {
			int count=0;
			for(num=i; num>=1; num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				PrimeNos=PrimeNos+i+" ";
			}
		}
		System.out.println("Prime nos from 1 to 20are :   ");
		System.out.println(PrimeNos);
	}

}

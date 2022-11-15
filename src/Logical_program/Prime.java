package Logical_program;

public class Prime {
	
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		String Primenos ="";
		
		
		for(i =1; i<=20; i++) {
			int count =0;
			
			for(num=i; num>=1; num--) {
				if(i%num==0) {
					count = count+1;
				}
			}
			
			if(count==2) {
				Primenos=Primenos+i+" ";
			}
		}
		System.out.println("Prime nos from 1 to 20 are :");
		
		System.out.println(Primenos);
	}

}

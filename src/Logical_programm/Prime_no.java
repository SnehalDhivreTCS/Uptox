package Logical_programm;

public class Prime_no {
	
	public static void main(String[] args) {
		int i =0;
		int num =0;
		String prm ="";
		
		
		for(i=0; i<=30; i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				prm = prm+i+" ";
				
			}
		}
		System.out.println(prm);
	}

}

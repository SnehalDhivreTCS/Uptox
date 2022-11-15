package Logical_practice;

public class White_sopaces____18 {
	
	public static void main(String[] args) {
		String name ="V E L O C I T Y ";
		
		int count =0;
		for(int i =1; i<=name.length()-1; i++) {
			char v = name.charAt(i);
			if(v==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}

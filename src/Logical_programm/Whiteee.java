package Logical_programm;

public class Whiteee {
	
	public static void main(String[] args) {
		String name = "S N E H A L ";
		
		int count = 0;
		for(int i =0; i<=name.length()-1; i++) {
			char v =name.charAt(i);
			if(v==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}

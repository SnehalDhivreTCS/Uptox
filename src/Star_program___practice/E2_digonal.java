package Star_program___practice;

public class E2_digonal {
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6; j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

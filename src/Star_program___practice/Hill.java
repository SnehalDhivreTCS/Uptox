package Star_program___practice;

public class Hill {
	
	public static void main(String[] args) {
		int spac =3;
		int star=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=spac; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			spac--;
			star=star+2;
		}
	}

}

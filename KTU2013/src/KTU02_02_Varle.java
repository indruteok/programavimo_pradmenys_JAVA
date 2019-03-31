import java.util.Scanner;

public class KTU02_02_Varle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek sveria varlė:");
		int m = reader .nextInt();
		System.out.println("Kiek varlių norima stebėti:");
		int n = reader .nextInt();

		int svoris = m * n;
		
		if (svoris >= 5000) {
			System.out.println( "Varlių stebėjimui pakanka" );
		} else {
				System.out.println("Varlių stebėjimui per mažai");
			}	
		reader.close();
	}

}

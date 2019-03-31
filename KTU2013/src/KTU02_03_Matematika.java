import java.util.Scanner;

public class KTU02_03_Matematika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
		
		System.out.println("Kokius pažymius gavo petriukas");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		int d = reader.nextInt();
		int e = reader.nextInt();
		
		

		int vidurkis = ( a + b + c + d + e ) / 5 ;
		
		if (vidurkis >= 9) {
			System.out.println( "Petriukas gaus tris saldainius" );
		} else if (vidurkis < 9 && vidurkis >= 7) {
			System.out.println( "Petriukas gaus du saldainius" );
		} else {
				System.out.println("Petriukas gaus vieną saldainius");
			}	
		reader.close();
	}

}

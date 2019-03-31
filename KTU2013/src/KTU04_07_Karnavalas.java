import java.util.Scanner;

public class KTU04_07_Karnavalas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int kiek = 0 ;
		int kiek2 = 0 ;
		
		System.out.println("Įveskite kiek balų gavo mokinys: ");
		while (true) {
			int num = reader.nextInt();
			if (num != 0) {
				if (num <= 10 ) {
					kiek++;	
				}
				
				if (num >= 5 ) {
					kiek2++;	
				}
			}
				if ( num == 0) {	
					
				System.out.print("Į karnavalą ėjo : " + kiek + " mokiniai, " );	 
				System.out.println("pateko: " + kiek2 +"." );		
		break;
			}	
	}
		reader.close();
}
}
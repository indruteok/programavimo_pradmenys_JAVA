import java.util.Scanner;

public class KTU03_02_Savaites_dienos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite, kurią savaitėa dieną prasidėjo menuo: ");
		int m = reader.nextInt();
		
		System.out.println("Įveskite dienų intervalą: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		
		for( a= a; a<=b ; a++ ) {
			m++;
		System.out.println( a + "-oji diena: " + m );
			
		}
		reader.close();
	}
}
mmmnn - nekartoja nuo 1 iki 7
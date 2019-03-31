import java.util.Scanner;

public class KTU02_07_Jonuko_problemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskite užduoties variantą:");
		int k = rd.nextInt();
		
		System.out.println("Įveskite a reikšmę:");
		int a = rd.nextInt();
		
		System.out.println("Įveskite b reikšmę:");
		int b = rd.nextInt();
		
		
		int ats = a*b+3;
		int ats1 = a+b;
		int ats2 = a-b;
		
		
		if (k == 1) {
			System.out.printf( "Atsakymas: x  " +  ats) ;
		} else if (k == 2 ) {
			System.out.println( "Atsakymas: x  "+ ats1 );
		} else if (k == 3) {
				System.out.println("Atsakymas: x  "+ ats2);
			}	
		else  {
			System.out.println("nėra tokio varianto");
		}
		rd.close();
	}

}

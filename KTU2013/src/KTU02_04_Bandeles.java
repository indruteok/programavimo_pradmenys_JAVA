import java.util.Scanner;

public class KTU02_04_Bandeles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskite kainas a ir b:");
		double a = rd.nextDouble();
		double b = rd.nextDouble();
		
		System.out.println("Įveskite kiekius n1, n2, n3:");
		int n1 = rd.nextInt();
		int n2 = rd.nextInt();
		int n3 = rd.nextInt();
		
		System.out.println("Įveskite bandelės kainą:");
		double k = rd.nextDouble();
		
		double ats = k*n1;
		double ats1 = k*n2;
		double ats2 = k*n3;
		
		
		if (k <= a) {
			System.out.printf( "Už bandeles sumokėta %.2f Lt.",  ats) ;
		} else if (k > a && k < b ) {
			System.out.println( "Už bandeles sumokėta "+ ats1 +" Lt." );
		} else {
				System.out.println("Už bandeles sumokėta "+ ats2 +" Lt.");
			}	
		rd.close();
	}

}

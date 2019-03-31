import java.util.Scanner;

public class KTU03_06_Kauliukai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite kauliukų kiekį:");
		int n = reader.nextInt();
		int kiek = 1;
		int b = n*6;
		double sum = 0;
		double average = 0;
		
		for(int i= 1; kiek<=n ; i++ ) {
			kiek++;
		System.out.print( i + "-o kauliuko taškų kiekis: ");
		 int e1 = reader.nextInt();
		 
		sum = sum + e1;
		}
		average = sum / n;

		System.out.println("Iš viso galima surinkti taškų: " + b );
		System.out.println("Tomas iš viso surinko: " + (int) sum );
		System.out.printf("Jo taškų vidurkis: %.1f ", average);
		System.out.println();
		
		if (sum > (b/2)) {
			System.out.println("Loterija laimėta");
		} else {
			System.out.println("Loterija pralaimėta");
		}
		reader.close();
	}
	}



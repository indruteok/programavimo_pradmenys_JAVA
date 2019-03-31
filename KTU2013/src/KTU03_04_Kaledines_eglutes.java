import java.util.Scanner;

public class KTU03_04_Kaledines_eglutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek egluciu atvesta:");
		int n = reader.nextInt();
		int kiek = 1;
		double sum = 0;
		double average = 0;
		
		for(int i= 1; kiek<=n ; i++ ) {
			kiek++;
	
		System.out.println( "Įveskite " + i + " eglutės aukštį:");
		int e1 = reader.nextInt();
		sum = sum + e1;
		}
		average = sum / n;

		System.out.println("Eglutės ukščio vidurkis:  "  + average + " cm");
		reader.close();
	}
}
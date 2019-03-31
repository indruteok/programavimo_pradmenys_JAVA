import java.util.Scanner;

public class KTU03_03_Snaiges_uz_lango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite, kiek snaigių nukrito per pirmąją sekundę  ir kiek sekundžių snigo:");
		int s = reader.nextInt();
		int n = reader.nextInt();
		int sum=0;
		int kiek = 1; // kiek tokiu skaiciu yra
		
		for(  s = s ;  kiek<=n ; s = s*2 ) {
				sum = sum + s;
				kiek++;	
		}
		System.out.println("Rezultas: " + sum);
		reader.close();
	}
}
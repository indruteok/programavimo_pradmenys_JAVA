import java.util.Scanner;

public class KTU03_08_Begimo_varzybos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek dalyvavo bėgikų:");
		int n = reader.nextInt();
		int kiek = 1;
		int sum = 0;
		int average = 0;
		int gl=100;
		int rez;
		
		for(int i= 1; kiek<=n ; i++ ) {
			kiek++;
		System.out.println( "Įveskite " + i + " bėgiko laiką:");
		int k1 = reader.nextInt();
		sum = sum + k1;
		
		if (k1 < gl ) 
		    gl = k1;
		}
	
		average = sum / n; 
		rez = average - gl;
		System.out.println("Greičiausio bėgiko laikas:  " + gl +" sek.");
		
		System.out.printf("Jis buvo: " +rez +" sek geresnis už vidurkį");
		reader.close();
	}
}

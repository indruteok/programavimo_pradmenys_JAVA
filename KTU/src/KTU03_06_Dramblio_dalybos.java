import java.util.Scanner;

public class KTU03_06_Dramblio_dalybos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite vidutinį hienos svorį:");
		int svoris = reader.nextInt();
		
		int kiek = 1;
		int kg= 0;
		for(int i= 1; kiek<=53 ; i++ ) {
			kiek++;
		kg = 7500 - svoris*svoris;
	}
		System.out.println("Liko " + kg + " kg dramblio mėsos");
		System.out.println("dienų skaičius:" + kiek);
	}
}

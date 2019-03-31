import java.util.Scanner;

public class KTU05_02_greiciausi_sraige {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("kiek sraigių dalyvauja");
		int n = reader.nextInt();
		int kiek = 0;
		double average=0;

		for (int i = 1; kiek < n; i++) {
			kiek++;

			System.out.println("kokį atstumą centimetrais įveikė sraigė:");
			int cm = reader.nextInt();
			
			System.out.println("per kokį laiką įveikė (min ir s):");
			double min = reader.nextDouble();
			int s = reader.nextInt();

			average =  cm/(min*60+s);
			System.out.printf("Vid greitis: %.2f", (double)average );
			System.out.println( );
		}
		
	}
	
	
						
	}



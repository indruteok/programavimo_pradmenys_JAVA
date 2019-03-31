import java.util.Scanner;

public class KTU01_03_duomenu_nalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		

		System.out.println("Koks ūgis?");
		Double h = reader.nextDouble();
		
		System.out.println("Koks svoris?");
		int F = reader.nextInt();
		
		System.out.println("Kokia liemens apimtis?");
		Double la = reader.nextDouble();
		
		System.out.println("Kokia klubų apimtis?");
		Double ka = reader.nextDouble();
		
		
		
		double ats = F/(h*h);
		double ats1 = F*0.24;
		double ats2 = (F-ats1)/0.8;
		double ats3 = (F-ats1)/0.75;
		double ats4 = la/ka;
		
		System.out.printf("KIMI= %.1f ",  ats );
		System.out.println();
		System.out.printf("Riebalų masė = %.3f ",  ats1);
		System.out.println();
		System.out.printf("Minimalus sveikas kūno svoris = %.1f", ats2);
		System.out.println();
		System.out.printf("Maksimalus sveikas kūno svoris = %.1f", ats3);
		System.out.println();
		System.out.printf("Riebalų pasiskirstymas = %.2f", ats4);
	}
		
	}


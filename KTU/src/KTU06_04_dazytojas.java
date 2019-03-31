import java.util.Scanner;

public class KTU06_04_dazytojas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite kambario ilgį ");
		double x = reader.nextDouble();
		System.out.println("Įveskite kambario plotį ");
		double y = reader.nextDouble();
		System.out.println("Įveskite kambario aukštį ");
		double a = reader.nextDouble();
		System.out.println("Įveskite dažų išeiga (m2) ");
		double l = reader.nextDouble();
		System.out.println("Įveskite dažų kaina (lt) ");
		double k = reader.nextDouble();
		
		double kiekis;

		double ats = dazuDezuciuReikes(x, y, a, l);
		System.out.printf("Reikiamas nupirkti dažų kiekis %.0f", ats);
		System.out.println();

		double ats1 = dazuKaina(k, ats);
		System.out.println("Dažų kaina eurais: " + ats1);

	}

	public static double dazuDezuciuReikes(double x, double y, double a, double l) {

		double plotas;
		double kiekis;
		plotas = (x * a) * 2 + (y * a) * 2;
		kiekis = plotas * l / 10;

		return kiekis;
	}

	public static double dazuKaina(double k, double kiekis) {
		double kaina;
		kaina = kiekis * k / 3.4528;

		return kaina;
	}

}

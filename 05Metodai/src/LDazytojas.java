import java.util.Scanner;

public class LDazytojas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double x = 4.3; // ilgis
		Double y = 11.0; // plotis
		Double a = 2.5; // aukstis
		Double l = 2.1; // dazu iseiga 1m2
		Double k = 8.9; // dazu kaina lt
		double kiekis;

		double ats = dazuDezuciuReikes(x, y, a, l);
		System.out.printf("Reikiamas nupirkti dažų kiekis %.0f", ats);
		System.out.printf("Reikiamas nupirkti dažų kiekis " + ats);
		System.out.println();

		double ats1 = dazuKaina(k, dazuDezuciuReikes(x, y, a, l));
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

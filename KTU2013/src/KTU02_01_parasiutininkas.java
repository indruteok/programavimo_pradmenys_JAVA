import java.util.Scanner;

public class KTU02_01_parasiutininkas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Iš kokio aukščio šoka parašiutininkas?");
		double h = reader.nextDouble();
		System.out.println("Per kiek sekundžių išsiskleidžia jo parašiutas?");
		double t = reader.nextDouble();

		double g = 9.8;
		double ats = Math.sqrt(2 * h / g);

		if (ats >= t) {
			System.out.println("parašiutas išsiskleis");
		} else {
			System.out.println("parašiutas neišsiskleis");
		}
		reader.close();
	}

}

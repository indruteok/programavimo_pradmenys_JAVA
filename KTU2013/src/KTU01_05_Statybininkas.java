import java.util.Scanner;

public class KTU01_05_Statybininkas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Sienos ilgis?");
		int a = reader.nextInt();

		System.out.println("Sienos auk6tis?");
		int h = reader.nextInt();

		System.out.println("Plytos kaina?");
		double k = reader.nextDouble();

		double ats = a * h / (0.2 * 0.1);
		double ats1 = ats * k;

		System.out.printf("Plytu kiekis %.0f ", ats);
		System.out.println();
		System.out.printf("Plytos kainuos %.2f Lt.", ats1);

		reader.close();
	}

}

import java.util.Scanner;

public class KTU01_02_Akvariumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek žuvų gyvena akvariume?");
		int a = reader.nextInt();

		System.out.println("Kiek žuvų į akavriumą įdedama kiekvieną dieną?");
		int b = reader.nextInt();

		System.out.println("Kiek dienų praėjo?");
		int n = reader.nextInt();

		int ats = a + (b * n);

		System.out.println("Po " + n + " dienų akvariume gyvens " + ats + " žuvų.");

		reader.close();
	}

}

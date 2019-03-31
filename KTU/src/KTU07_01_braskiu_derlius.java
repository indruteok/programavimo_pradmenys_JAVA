import java.util.Scanner;

public class KTU07_01_braskiu_derlius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("kiek dienų skins");
		int n = reader.nextInt();
		int kiek = 0;
		int deze10;
		int deze5;
		int deze3 = 0;
		int sum10 = 0;
		int sum5 = 0;
		int sum3 = 0;

		for (int i = 1; kiek < n; i++) {
			kiek++;

			System.out.println("surinktų braskių kiekis kg:");
			int kg = reader.nextInt();

			deze10 = kg / 10;
			deze5 = (kg % 10) / 5;
			deze3 = ((kg % 10) % 5) / 3;

			sum10 = sum10 + deze10;
			sum5 = sum5 + deze5;
			sum3 = sum3 + deze3;

			if (deze3 % 3 == 0  ) {
				System.out.println(kiek + " diena " + deze10 + " " + deze5 + " " + deze3 + " ");
			} else {
				System.out.println(kiek + " diena " + deze10 + " " + deze5 + " " + (deze3 + 1) + " ");
			}
		}
		// if (deze3 % 5 == 0) {
		System.out.println(" Iš viso: " + sum10 + " " + sum5 + " " + sum3 + " ");
//	} else
//		System.out.println(" Iš viso: " + sum10 + " " + sum5 + " " + (sum3 + 4) + " ");
		reader.close();
	}
}

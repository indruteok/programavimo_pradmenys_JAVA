import java.util.Scanner;

public class Uzd03_07LT_Kampas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite kampo dydį, lipsniais:");
		int x = reader.nextInt();
		reader.close();

		if (x == 90) {
			System.out.printf("Statusis");
		} else if (x < 0) {
			System.out.println("Kampo dydis turi būti teigiamas skaičius");
		} else if (x == 180) {
			System.out.println("Ištiestinis");
		} else if (x == 360) {
			System.out.println("Pilnutinis");
		} else
			System.out.println("Pavadinimo nėra");
		reader.close();
	}
}

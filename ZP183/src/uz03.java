import java.util.Scanner;

public class uz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite pirmą numerį:");
		int a = reader.nextInt();

		System.out.println("Įveskite antrą numerį:");
		int b = reader.nextInt();
		reader.close();

		if (a == b) {
			System.out.println("Įvesti numeriai lygūs! Jei norite palyginti jie turi skirtis.");
		} else if (a > b) {
			System.out.println("Didesnis skaičius yra: " + a);
		} else {
			System.out.println("Didesnis skaičius yra: " + b);
		}

	}
}
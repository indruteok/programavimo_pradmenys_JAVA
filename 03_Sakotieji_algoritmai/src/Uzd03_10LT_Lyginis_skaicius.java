import java.util.Scanner;

public class Uzd03_10LT_Lyginis_skaicius {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaiciu:");
		int a = reader.nextInt();

		System.out.println("Įveskite skaiciu:");
		int b = reader.nextInt();

		System.out.println("Įveskite skaiciu:");
		int c = reader.nextInt();

		reader.close();

		if ((a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0)) {
			System.out.print("Taip");

		} else {
			System.out.print("Ne");
		}

	}

}

import java.util.Scanner;

public class uzd3_1metodu_tikrinimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public static int day(int day) {
		Scanner reader = new Scanner(System.in);

		int day;
		System.out.println("iveskite savaites diena");
		day = reader.nextInt();
		switch (day) {
		case 1:
			System.out.println("Pirmadienis");
			break;

		case 2:
			System.out.println("Antradienis");
			break;

		case 3:
			System.out.println("Treciadienis");
			break;

		case 4:
			System.out.println("Ketvirtadienis");
			break;

		case 5:
			System.out.println("Penktadienis");
			break;

		case 6:
			System.out.println("Šeštadeinis");
			break;

		case 7:
			System.out.println("Sekamadienis");
			break;
		default:
			System.out.println("ivedimo klaida");
		}
		System.out.println();

	}

}

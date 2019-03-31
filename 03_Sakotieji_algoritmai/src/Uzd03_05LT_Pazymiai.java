import java.util.Scanner;

public class Uzd03_05LT_Pazymiai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite pažymį:");
		int grade = reader.nextInt();
		reader.close();

		switch (grade) {
		case 10:
			System.out.println("Puikiai");
			break;
		case 9:
			System.out.println("Labai gerai");
			break;
		case 8:
			System.out.println("Gerai");
			break;
		case 7:
			System.out.println("Vidutiniškai");
			break;
		default:
			System.out.println("Reikia daugiau pastangų");

		}
	}
}

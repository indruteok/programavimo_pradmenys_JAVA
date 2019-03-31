import java.util.Scanner;

public class KTU01_03_Taupykle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek yra monetų po 5 ct ?");
		double a = reader.nextInt();

		System.out.println("Kiek yra monetų po 20 ct ?");
		double b = reader.nextInt();

		System.out.println("Kiek yra monetų po 2 Lt ?");
		double c = reader.nextInt();

		double ats = ((5 * a) + (20 * b) + (200 * c)) / 100;

		System.out.println("Taupyklėje yra " + ats + " Lt.");

		reader.close();
	}

}

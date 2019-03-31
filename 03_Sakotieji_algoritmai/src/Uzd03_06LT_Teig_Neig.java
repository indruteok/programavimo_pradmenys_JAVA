import java.util.Scanner;

public class Uzd03_06LT_Teig_Neig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaiciu:");
		int x = reader.nextInt();

		if (x == 0) {
			System.out.printf("Nulis");
		} else if (x > 0) {
			System.out.println("Teigiamas");
		} else
			System.out.println("Negiamas");
	}
}

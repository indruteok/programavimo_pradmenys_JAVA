import java.util.Scanner;

public class Uzd03_09LT_Trikampis {

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

		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			System.out.print("Galima sudaryti trikampį");
		} else
			System.out.print("Negalima sudaryti trikampio");
	}
}

import java.util.Scanner;

public class Uzd03_08LT_Trizenklis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaiciu:");
		int x = reader.nextInt();
		reader.close();

		if (x < 100) {
			System.out.printf("Ne");
		} else if (x > 999) {
			System.out.println("Ne");
		} else
			System.out.println("Taip");
		reader.close();
	}
}

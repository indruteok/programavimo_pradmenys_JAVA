import java.util.Scanner;

public class uz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite Intervalą nuo a iki b:");
		int a = reader.nextInt();
		int b = reader.nextInt();

		int kiek = 0; // kiek tokiu skaiciu yra
		for (a = a; a <= b; a++) {
			if (a % 6 == 0) {
				// System.out.println(i);
				kiek++;
			}
		}
		System.out.println("Reikalingų marškinėlių skaičius: " + kiek);
		reader.close();
	}
}

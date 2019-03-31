import java.util.Scanner;

public class Uzd03_03LT_Akcija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite prekės kainą:");
		double k = rd.nextDouble();

		System.out.println("Įveskite perkamus vienetus:");
		int vnt = rd.nextInt();
		rd.close();

		double sum = k * vnt;
		double sum1 = (k * vnt) * 0.8;

		if (vnt > 3) {

			System.out.printf("Suma su nuolaida: %.2f eur.", sum1);
		} else {
			System.out.println("Suma (be nuolaidos): " + (double) sum);
		}

	}

}

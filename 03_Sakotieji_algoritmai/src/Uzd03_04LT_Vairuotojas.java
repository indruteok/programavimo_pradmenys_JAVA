import java.util.Scanner;

public class Uzd03_04LT_Vairuotojas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite dėžių kiekį:");
		int n = rd.nextInt();

		System.out.println("Įveskite kiektelpa dėžių į mašiną:");
		int m = rd.nextInt();

		rd.close();

		int sum = n / m;
		int sum1 = n % m;
		int sum3 = sum1 + sum;

		System.out.println("Gauta: " + sum3);

	}

}

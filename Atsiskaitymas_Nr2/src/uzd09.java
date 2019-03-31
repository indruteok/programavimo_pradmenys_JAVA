import java.util.Scanner;

public class uzd09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite partijų skaičių:");
		int n = reader.nextInt();
		int kiek = 1;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; kiek <= n; i++) {
			kiek++;

			System.out.println("Įveskite " + i + "-osios partijos abiejų žaidėjų taškus :");
			int e1 = reader.nextInt();
			int e2 = reader.nextInt();
			sum1 = sum1 + e1;
			sum2 = sum2 + e2;
			if (e1 % 6 == 0)
				sum1 = sum1 - e1 - e1 - e1;
			if (e2 % 6 == 0)
				sum2 = sum2 - e2 - e2 - e2;
			if (e1 % 3 == 0)
				sum1 = sum1 + e1 + e1 - e1;
			if (e2 % 3 == 0)
				sum2 = sum2 + e2 + e2 - e2;
		}
		System.out.println("Rezultatas: " + sum1 + " : " + sum2);

		if (sum1 > sum2) {
			System.out.println("Laimėjo pirmas žaidėjas");
		} else {
			System.out.println("Laimėjo antras žaidėjas");
		}
		reader.close();
	

}}

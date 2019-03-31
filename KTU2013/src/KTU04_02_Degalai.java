import java.util.Scanner;

public class KTU04_02_Degalai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int kiek = 1;
		int sum = 1;
		int sum2 = 1;
		int kiek2 = 0;

		System.out.println("Įveskite kuro bako talpą: ");
		int t = reader.nextInt();
		System.out.println("Įveskite kuro sąnaudas n: ");
		int n = reader.nextInt();
		sum = t - n;
		sum2 = t - 2 * n;
		for (int d = 1; kiek > 5; d++) {
			if (kiek % 2 == 0)

				if (kiek % 2 != 0)
					kiek++;
		}

		if (kiek % 2 == 0)

			kiek2 = sum + sum2;
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(kiek2);

		System.out.println("Keliauti bus galima " + kiek + " dienų/as /ą");

		reader.close();
	}

}
tyujikol
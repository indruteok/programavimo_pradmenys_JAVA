import java.util.Scanner;

public class KTU08_01_Prekiu_apskaita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek prekių parduota:");
		int r = reader.nextInt();

		int kiek = 1;
		double sum = 0;
		double vid = 0;
		double average = 0;

		for (int i = 1; kiek <= r; i++) {
			kiek++;

			System.out.println("Įveskite kasininkės numerį:");
			int nrKasininkes = reader.nextInt();
			System.out.println("prekes kaina ");
			double kaina = reader.nextDouble();

		}

		if (nrKasininkes == 1) {
			sum = sum + kaina;
			average = sum / kiek;

		} else if (nrKasininkes == 2) {
				sum = sum + kaina;
				average = sum / kiek;
		} else (nrKasininkes == 3) {
					sum = sum + kaina;
					average = sum / kiek;
				}

				System.out.println("Kasininkė 1:");
				System.out.println("Per dieną pardavė prekių už " + sum + " Eur.");
				System.out.println("Vidutiniškai viena prekė kainvo " + average + " Eur.");
				System.out.println();

				System.out.println("Kasininkė 2:");
				System.out.println("Per dieną pardavė prekių už " + sum + " Eur.");
				System.out.println("Vidutiniškai viena prekė kainvo " + average + " Eur.");
				System.out.println();

				System.out.println("Kasininkė 3:");
				System.out.println("Per dieną pardavė prekių už " + sum + " Eur.");
				System.out.println("Vidutiniškai viena prekė kainvo " + average + " Eur.");
				System.out.println();

				System.out.println("Per dieną parduota pekių už " + sum + " Eur.");

			}

		}
	}
}

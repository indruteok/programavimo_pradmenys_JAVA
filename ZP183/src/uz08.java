import java.util.Scanner;

public class uz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek kartų šaulys šaus į taikinį:");
		int n = reader.nextInt();

		int kiek = 1;
		int suma = 0;

		for (int i = 1; kiek <= n; i++) {
			kiek++;

			System.out.println("Įveskite taikinio centro koordinates x0 ir y0:");
			int x0 = reader.nextInt();
			int y0 = reader.nextInt();

			System.out.println("Įveskite pataikymo taško koordinates x ir y:");
			int x = reader.nextInt();
			int y = reader.nextInt();

			int ats = kiekTaskuGausSaulys(x, y);
			suma = suma + ats;
		}

		System.out.println("Šaulys iš viso gaus " + suma + " tašks/ų");
	}

	private static int kiekTaskuGausSaulys(int x, int y) {
		if ((x == 5 && y <= 1) || (x == 4 && y <= 2) || (x == 3 && y <= 3) || (x == 2 && y <= 4)
				|| (x == 1 && y <= 5)) {
			return 10;
		} else if ((x == 10 && y <= 1) || (x == 9 && y <= 2) || (x == 8 && y <= 3) || (x == 7 && y <= 4)
				|| (x == 6 && y <= 5) || (x == 5 && y <= 4)) {
			return 5;
		} else
			return 0;
	}
}

import java.util.Scanner;

public class KTU05_01_dainu_albumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("kiek yra vieno albumo dainų");
		int n = reader.nextInt();
		int kiek = 0;
		int sum = 0;
		int average;
		int min1;
		int s1;
		int minvid;
		int svid;

		for (int i = 1; kiek < n; i++) {
			kiek++;

			System.out.println("dainu trukmė minutėmis ir sekundėmis:");
			int min = reader.nextInt();
			int s = reader.nextInt();

			int laikas = min * 60 + s;
			sum = sum + laikas;
		}
		
		min1 = sum / 60;
		s1 = sum % 60;
		average = (sum) / kiek;
		minvid = average / 60;
		svid = average % 60;
		
		System.out.println("Viso: " + min1 + " min. " + s1 + " s. ");
		System.out.println("Vidurkis: " + minvid + " min. " + svid + " s. ");
	}
}

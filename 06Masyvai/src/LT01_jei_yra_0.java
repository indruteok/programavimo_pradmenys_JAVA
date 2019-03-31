import java.util.Random;

public class LT01_jei_yra_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		// int a = r.nextInt(12);
		// System.out.println(a);

		int max = 15;
		int min = -2;

		int[] a = new int[12];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
			System.out.print(a[i] + " ");
		}

		int ats;
		int kiek = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] == 0) {
				ats = a[i];
				kiek++;
			}
		}
		System.out.println();
		System.out.println("Masyve yra 0 skičius -  " + kiek + " vnt.");
	}
}

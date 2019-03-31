import java.util.Random;

public class LT02_kurie_dalijasi_is_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Random r = new Random();
		// int a = r.nextInt(12);
		// System.out.println(a);

		int max = 20;
		int min = -10;

		int[] a = new int[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
			System.out.print(a[i] + " ");
		}
		System.out.println();

		int kiek = 0;
		int sum = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				sum = sum + a[i];
				kiek++;
			}

		}
		System.out.println();
		System.out.println("suma skaičių kurie dalijasi is trijų: " + sum);
		System.out.println("Masyve tokių skaičių yra -  " + kiek);
	}

}

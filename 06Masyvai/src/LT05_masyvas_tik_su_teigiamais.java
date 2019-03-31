import java.util.Arrays;
import java.util.Random;

public class LT05_masyvas_tik_su_teigiamais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 10;
		int min = -5;

		int[] a = new int[10];
		
		int kiekT = 0;

		randomArr(a, min, max);
		
		kiekT = kiekTeigiamu(a);

		System.out.println(Arrays.toString(a));
		System.out.println();

		int[] b = new int[kiekT];

		naujasMasyvas(a, b);

		System.out.println(Arrays.toString(b));

	}

	private static void naujasMasyvas(int[] a, int[] b) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[j] = a[i];
				j++;
			}
		}
	}

	private static int kiekTeigiamu(int[] a) {
		int kiek = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				kiek++;
		}
		return kiek;
	}

	private static void randomArr(int[] a, int min, int max) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
	}
}

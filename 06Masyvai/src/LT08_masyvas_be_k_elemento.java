import java.util.Arrays;
import java.util.Random;

public class LT08_masyvas_be_k_elemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 15;
		int min = 5;
		int[] a = new int[20];

		int k = 2;

		randomArr(a, min, max);

		System.out.println(Arrays.toString(a)); // -spausdinimas eilute
		System.out.println();

		int[] b = new int[a.length - 1];

		naujasMasyvas(a, b, k);

		System.out.println(Arrays.toString(b));
	}

	private static void naujasMasyvas(int[] a, int[] b, int k) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != k) {
				b[j] = a[i];
				j++;
			}
		}
	}

	private static void randomArr(int[] a, int min, int max) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
	}
}

import java.util.Arrays;
import java.util.Random;

public class LT06_sukeicia_k_elementa_su_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int max = 15;
		int min = 5;

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}

		System.out.println(Arrays.toString(a));   //-spausdinimas eilute

		int k = 2;
		int m = 9;
		int laikinas;

		laikinas = a[k];
		a[k] = a[m];
		a[m] = laikinas;

		System.out.println(Arrays.toString(a));

	}
}

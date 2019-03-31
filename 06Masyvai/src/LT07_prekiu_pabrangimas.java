import java.util.Arrays;
import java.util.Random;

public class LT07_prekiu_pabrangimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int max = 10;
		int min = 3;

		double[] a = new double[200];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}

		System.out.println(Arrays.toString(a)); // -spausdinimas eilute

		double sum = 0;
		double vidurkis = 0;
		double p = 0.3;
		double sum1 = 0;
		double vidurkis1 = 0;

		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];
		}
		vidurkis = sum / a.length;
		System.out.println("Kainų suma prieš pabrangimą " + sum);
		System.out.println("kainų vidurkis " + vidurkis);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] < vidurkis) {
				a[i] = a[i] * (1 + p);
				System.out.printf("%.2f; ", a[i]);
			} else {
				System.out.printf("%.2f; ", a[i]);
			}
			sum1 = sum1 + a[i];
		}

		System.out.println();
		vidurkis1 = sum1 / a.length;
		System.out.printf("Kainų suma po pabrangimo %.2f; ", sum1);
		System.out.println();
		System.out.printf("Pabrangintų kainų vidurkis %.2f; ", vidurkis1);

	}
}

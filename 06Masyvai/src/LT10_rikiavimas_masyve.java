import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LT10_rikiavimas_masyve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 15;
		int min = -5;
		int[] a = new int[10];

		randomArr(a, min, max);

		System.out.println(Arrays.toString(a)); // -spausdinimas eilute
		System.out.println();

		Arrays.sort(a);
		System.out.printf("Masyvas arr[] didejancia tvarka : %s", Arrays.toString(a));
	}

	private static void randomArr(int[] a, int min, int max) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
	}
}
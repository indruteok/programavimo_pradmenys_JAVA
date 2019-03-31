import java.util.Arrays;
import java.util.Random;

public class LT14_neigami_sk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int max = 20;
		int min = -5;
		int kiek1 = 0;

		int[] a = new int[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
		System.out.println(Arrays.toString(a));
		System.out.println();

		System.out.print("1. Ar yra neigiamu elementų?");

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.print(" TAIP ");
				break;
			}
		}

		System.out.println();
		System.out.print("2. Visi neigiami elementai: ");
		// neigiami sk.:
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				kiek1++;
				System.out.print(a[i] + ", ");
			} else {
			}
		}

		// teigiami sk,
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				System.out.print(" ");
			} else {
			}
		}

		System.out.println();
		System.out.println("3. Neigiamų elementų kiekis: " + kiek1);

	}

}

//kaip padaryti kad spausdintu Ne arba taip tik viena?
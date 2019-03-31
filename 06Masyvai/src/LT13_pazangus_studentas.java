import java.util.Arrays;
import java.util.Random;

public class LT13_pazangus_studentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Random r = new Random();

		int max = 10;
		int min = 1;
		int kiek = 0;
		int kiek1 = 0;
		int vidurkis = 0;
		int sum = 0;

		int[] a = new int[30];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
		System.out.println(Arrays.toString(a));
		System.out.println();

		// kiek neislaike:
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 && a[i] <= 4) {
				kiek1++;
				System.out.print(a[i] + ", ");
			} else {
			}
		}

		// pazangiu studentu vidurkis
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 5) {
				kiek++;
				System.out.print(a[i] + ", ");
				sum = sum + a[i];
			} else {
			}
		}
		vidurkis = sum / kiek;
		System.out.println();
		System.out.println("kiek neišlaike egzamino : " + kiek1);
		System.out.println("pažangių studentų vidurkis: " + vidurkis);
	}
}

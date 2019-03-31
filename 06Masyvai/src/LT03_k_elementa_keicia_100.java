import java.util.Arrays;
import java.util.Random;

public class LT03_k_elementa_keicia_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
	
		int max = 30;
		int min = -10;

		int[] a = new int[30];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);	
		}
		System.out.println(Arrays.toString(a));

		
		
		int kiek = 0;
		int k = 3;

		for (int i = 0; i < a.length; i++) {
			kiek++;
			if (kiek % k == 0) {
				a[i] = 100;
			} else {
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

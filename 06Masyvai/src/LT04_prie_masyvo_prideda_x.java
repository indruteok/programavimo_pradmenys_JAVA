import java.util.Arrays;
import java.util.Random;

public class LT04_prie_masyvo_prideda_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int max = 10;
		int min = -5;

		int[] a = new int[17];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println();

		int x = 5;

		for (int i = 0; i < a.length; i++) {
			a[i] += x;    /// a[i] = a[i] + x; 	
		}
		System.out.println(Arrays.toString(a));
	}
}

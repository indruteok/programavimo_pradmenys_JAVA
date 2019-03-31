import java.util.Arrays;
import java.util.Random;

public class LT17_didejimo_tvarka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random r = new Random();
		
		int max = 10;
		int min = -5;

		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);	
		}
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);
		System.out.printf("Masyvas arr[] didejancia tvarka : %s", Arrays.toString(a));
		
	xcvbh	
		
	}
}

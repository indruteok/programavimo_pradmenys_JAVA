import java.util.Arrays;
import java.util.Random;

public class LT16_pirmojo_neig_elemento_nr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int max = 20;
		int min = -10;
		
	
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
	
		System.out.println();
		System.out.print("Pirmas neigiamas elementas: ");
		
		// neigiami sk.:
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0 ) {
				System.out.print(a[i] + ". ");
				break;
			} else {	
			}
		}
	}
}



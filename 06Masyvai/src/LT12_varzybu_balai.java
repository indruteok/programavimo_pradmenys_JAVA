import java.util.Arrays;
import java.util.Random;

public class LT12_varzybu_balai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random r = new Random();
		
		int max = 10;
		int min = 1;

		int[] a = new int[8];

		for (int i = 0; i < a.length; i++) {
			a[i] = min + r.nextInt(max);	
		}
		System.out.println(Arrays.toString(a));

		int kiek = 0;
		int kiek1 = 0;
		int did =a[0];
		int maz = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>did) 
				did =a[i];
			kiek++;	
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<maz)
				maz =a[i];
			kiek1++;	
		}
	//	System.out.println(Arrays.toString(a));
		System.out.println("Auksciausias balas " +did );
		System.out.println("Žemiausias balas" +maz );	
	}

}
parasyti B intervala be did ir maz balu.. ir vidurki suskaiciuoti
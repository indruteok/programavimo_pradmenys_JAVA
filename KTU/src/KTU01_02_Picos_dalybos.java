import java.util.Scanner;

public class KTU01_02_Picos_dalybos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);

		System.out.println("Kokią pinigų sumą skyrė Rolandas? ");
		double r = rd.nextDouble();
		System.out.println("Kokią pinigų sumą skyrė Vilanas? ");
		double v = rd.nextDouble();
		System.out.println("Kokią pinigų sumą skyrė Amandas? ");
		double a = rd.nextDouble();

		double ats = 1 / ((r + v + a) / r);
		double ats1 = 1 / ((r + v + a) / v);
		double ats2 = 1 / ((r + v + a) / a);

		System.out.printf("Rolandas gaus: %.2f picos dalį", ats);
		System.out.println();
		System.out.printf("Vilandas gaus: %.2f picos dalį ", ats1);
		System.out.println();
		System.out.printf("Amandas gaus: %.2f picos dalį ", ats2);
	}
}

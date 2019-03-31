import java.util.Scanner;

public class KTU01_04_Obuoliai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);

		System.out.println("Po kiek obuolių į klasę atsinešė mokiniai?");
		int k = rd.nextInt();

		int ats = (20 + (7 * k)) / 8;
		int ats2 = (20 + (7 * k)) % 8;

		System.out.println("Mokiniams ir mokytojai tenka po  " + ats + " obuolus/ių/ius.");
		System.out.println("Liko obuolių: " + ats2);
	}
}

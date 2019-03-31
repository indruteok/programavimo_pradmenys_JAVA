import java.util.Scanner;

public class KTU01_10_Saldainiai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek saldainių gauna Marius?");
		int n = reader.nextInt();
		System.out.println("Po kiek saldainių suvalgo?");
		int a = reader.nextInt();
		System.out.println("Kelios dienos liko iki kalėdų?");
		int k = reader.nextInt();

		int ats = ((n - a) * k) / a;
		int ats1 = ((n - a) * k) % a;

		System.out.println("Marius dovanas paruoš " + ats + " draugų.");
		System.out.println("Supakavus dovanas liks " + ats1 + " saldainiai");

		reader.close();

	}

}

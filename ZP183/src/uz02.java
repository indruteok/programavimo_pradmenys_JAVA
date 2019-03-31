import java.util.Scanner;

public class uz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek saldainių gauna Marius?");
		int n = reader.nextInt();
		System.out.println("Po kiek saldainių suvalgo?");
		int a = reader.nextInt();
		System.out.println("Kelios dienos liko iki kalėdų?");
		int k = reader.nextInt();

		int d = ((n - a) * k) / a;
		int s = ((n - a) * k) % a;

		System.out.println("Marius dovanas paruoš " + d + " draugų.");
		System.out.println("Supakavus dovanas liks " + s + " saldainiai");

		reader.close();

	}

}

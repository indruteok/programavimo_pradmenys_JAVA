import java.util.Scanner;

public class KTU08_03_trikampioPlotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("a krastines koordinates x ir y:");
		int xa = reader.nextInt();
		int ya = reader.nextInt();

		System.out.println("b krastines koordinates x ir y:");
		int xb = reader.nextInt();
		int yb = reader.nextInt();

		System.out.println("c krastines koordinates x ir y:");
		int xc = reader.nextInt();
		int yc = reader.nextInt();

		double ats = trikampioplotas(xa, ya, xb, yb, xc, yc);
		System.out.println("Trikampio plotas: " + ats);
	}

	public static double trikampioplotas(double xa, double ya, double xb, double yb, double xc, double yc) {

		double ab = Math.sqrt(((xb - xa) * (xb - xa)) + ((yb - ya) * (yb - ya)));
		double ac = Math.sqrt(((xc - xa) * (xc - xa)) + ((yc - ya) * (yc - ya)));
		double cb = Math.sqrt(((xb - xc) * (xb - xc)) + ((yb - yc) * (yb - yc)));

		double s = ((ab + ac + cb) / 2) * (((ab + ac + cb) / 2) - ab) * (((ab + ac + cb) / 2) - ac)
				* (((ab + ac + cb) / 2) - cb);
		return Math.sqrt(s);
	}

}

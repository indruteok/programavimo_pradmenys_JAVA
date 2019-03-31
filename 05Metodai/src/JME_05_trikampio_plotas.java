import java.util.Scanner;

public class JME_05_trikampio_plotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Input Side-1:");
		int a = reader.nextInt();
		System.out.println("Input Side-2:");
		int b = reader.nextInt();
		System.out.println("Input Side-3:");
		int c = reader.nextInt();

		double ats = trikampioPlotas(a, b, c);
		System.out.println(ats);
	}

	public static double trikampioPlotas(double a, double b, double c) {
		double s = ((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c);
		return Math.sqrt(s);

	}

}

import java.util.Scanner;

public class uzd07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įvestas a:");
		int a = reader.nextInt();
		System.out.println("Įvestas b:");
		int b = reader.nextInt();
		System.out.println("Įvestas c:");
		int c = reader.nextInt();
		reader.close();

		int b2 = (int) Math.pow(b, 2);
		int D = b2 - 4 * a * c;

		double D1 = Math.sqrt(D);

		int ats1 = (-b + (int) D1) / (2 * a);
		int ats2 = (-b - (int) D1) / (2 * a);
		int x1 = ats1 + 1 / 2;
		int x2 = ats2 + 1 / 2;
		int x3 = -(b / 2 * a);

		System.out.println("_________________________________________________________________");
		System.out.println("Įvesta: " + a + ", " + b + ", " + c);

		if (D > 0) {
			System.out.println("Gauta: x1=" + x1 + ", x2= " + x2);
			System.out.println("__________________________________________________________________");
		} else if (D == 0) {
			System.out.println(x3);
			System.out.println("__________________________________________________________________");
		} else {
			System.out.println("sprendinių nėra, nes D neigiamas.");
			System.out.println("__________________________________________________________________");
		}

		reader.close();
	}
}

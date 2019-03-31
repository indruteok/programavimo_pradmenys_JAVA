import java.util.Scanner;

public class uzd01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 0;
		int n = 0;

		System.out.println("Sum: " + getTotal(m, n));
	}

	public static int getTotal(int m, int n) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter first number: ");
		m = reader.nextInt();
		System.out.println("Enter second number: ");
		n = reader.nextInt();
		int suma;
		suma = m + n;

		return suma;
	}
}
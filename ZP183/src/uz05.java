import java.util.Scanner;

public class uz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		int i = -100;
		int a = -199;

		while (i >= a) {

			System.out.print(i + " ");
			i = i - 3;
		}

		System.out.println(" ");

		for (i = -100; i >= a; i = i - 3) {
			System.out.print(i + " ");
		}
	}
}

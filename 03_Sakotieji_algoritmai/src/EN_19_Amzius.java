import java.util.Scanner;

public class EN_19_Amzius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("How old are you?");
		int a = reader.nextInt();
		reader.close();

		if (a < 0) {
			System.out.println("Impossible!");
		} else if (a > 120) {
			System.out.println("Impossible!");
		} else {
			System.out.println("OK");
		}

	}
}

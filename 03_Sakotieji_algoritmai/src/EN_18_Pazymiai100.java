import java.util.Scanner;

public class EN_18_Pazymiai100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the points [0-60]:");
		int mark = reader.nextInt();
		reader.close();

		if (mark <= 29) {
			System.out.println("failed");
		} else if (mark <= 34) {
			System.out.println("1");
		} else if (mark <= 39) {
			System.out.println("2");
		} else if (mark <= 44) {
			System.out.println("3");
		} else if (mark <= 49) {
			System.out.println("4");
		} else if (mark <= 60) {
			System.out.println("5");
		}

	}
}

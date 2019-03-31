import java.util.Scanner;

public class EN_17_DidziausasNr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the first number:");
		int a = reader.nextInt();

		System.out.println("Type the second number:");
		int b = reader.nextInt();
		reader.close();

		if (a == b) {
			System.out.println("The numbers are equal!");
		} else if (a > b) {
			System.out.println("Greater number:" + a);
		} else {
			System.out.println("Greater number:" + b);
		}

	}
}
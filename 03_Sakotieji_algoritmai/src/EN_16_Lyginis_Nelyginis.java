import java.util.Scanner;

public class EN_16_Lyginis_Nelyginis {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a number:");
		int a = reader.nextInt();
		reader.close();
		if (a % 2 == 0) {
			System.out.println("Number " + a + " is even.");
		} else {
			System.out.println("Number " + a + " is odd.");
		}
	}
}

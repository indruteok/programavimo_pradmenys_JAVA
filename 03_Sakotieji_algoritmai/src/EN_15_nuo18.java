
import java.util.Scanner;

public class EN_15_nuo18 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// Type your program here:

		System.out.println("How old are you?");
		int x = reader.nextInt();
		reader.close();
		if (x >= 18) {
			System.out.println("You have reached the age of majority!");
		} else {
			System.out.println("You have not reached the age of majority yet!");

		}
	}
}

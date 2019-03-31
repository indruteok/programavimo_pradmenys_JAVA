import java.util.Scanner;

public class EN38_Many_prints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("How many times the text should be printed:");
		int kiek = reader.nextInt();

		for (int i = 0; i < kiek; i++) {
			printText();
		}

	}

	public static void printText() {

		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
}

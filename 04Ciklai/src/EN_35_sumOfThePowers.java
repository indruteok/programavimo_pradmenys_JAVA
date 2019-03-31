import java.util.Scanner;

public class EN_35_sumOfThePowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the last number:");
		int sk = reader.nextInt();

		int ats = 1;
		int i = 0;

		while (i < sk) {
			i++;
			ats = ats + (int) Math.pow(2, i);
		}
		System.out.println("Sum is " + ats);
	}
}

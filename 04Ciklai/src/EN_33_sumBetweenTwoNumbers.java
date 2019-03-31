import java.util.Scanner;

public class EN_33_sumBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the first number:");
		int i = reader.nextInt();

		System.out.println("Type the last number:");
		int sk = reader.nextInt();

		int sum = i + 0;

		while (i < sk) {

			i++;
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
	}
}

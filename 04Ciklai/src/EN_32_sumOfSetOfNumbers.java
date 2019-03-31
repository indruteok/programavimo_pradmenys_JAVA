import java.util.Scanner;

public class EN_32_sumOfSetOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int i = 0;
		int sum = 0;

		System.out.println("Type the number:");
		int sk = reader.nextInt();

		while (i < sk) {
			i++;
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
	}
}

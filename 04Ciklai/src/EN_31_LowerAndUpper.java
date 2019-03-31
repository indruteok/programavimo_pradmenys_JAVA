import java.util.Scanner;

public class EN_31_LowerAndUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Type the first number:");
		int i = reader.nextInt();

		System.out.println("Type the last number:");
		int max = reader.nextInt();

		while (i <= max) {
			System.out.println(i + " ");
			i++;
		}
	}

}

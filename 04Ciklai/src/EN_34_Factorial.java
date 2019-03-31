import java.util.Scanner;

public class EN_34_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the last number:");
		int sk = reader.nextInt();

		int caunt = 1;
		int i = 0;

		while (i < sk) {
			i++;
			caunt = caunt * i;
		}
		System.out.println("Sum is " + caunt);
	}
}
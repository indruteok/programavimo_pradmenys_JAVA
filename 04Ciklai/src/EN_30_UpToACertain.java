import java.util.Scanner;

public class EN_30_UpToACertain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Type the number:");
		int max = reader.nextInt();

		int i = 1;
		while (i <= max) {
			System.out.println(i + " ");
			i++;
		}
	}

}

import java.util.Scanner;

public class Uzd03_02LT_Kvadratas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite skaičių:");
		int n = rd.nextInt();
		rd.close();

		if (n % 4 == 0) {
			System.out.println("Kvadratą sudaryti galima");
		} else {
			System.out.println("Kvadrato sudaryti negalima!");
		}

	}

}

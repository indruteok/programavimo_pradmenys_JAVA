import java.util.Scanner;

public class Uzd03_01LT_Saknis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite skaičių:");
		int sk = rd.nextInt();

		rd.close();

		double saknis = Math.sqrt(sk);

		if (sk >= 0) {
			System.out.println(saknis);
		} else {
			System.out.println("Šaknies ištraukti negalima, nes įvestas neigiamas skaičius!");
		}

	}
}

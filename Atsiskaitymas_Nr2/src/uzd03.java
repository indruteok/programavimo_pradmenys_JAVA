import java.util.Scanner;

public class uzd03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int x = 1;
		int y = 1;

		System.out.println("Įvesk skaičius:");
		while (true) {
			int num = reader.nextInt();
			x = num % 10;
			y = num / 10;
			if (num > 10 && num < 100 && x == y) {
				System.out.println("Įvestas skaičius " + num + " nutraukė ciklo veikimą.");
				break;
			}
		}
		reader.close();
	}

}

//sk
//if(sk/10==sk%10)
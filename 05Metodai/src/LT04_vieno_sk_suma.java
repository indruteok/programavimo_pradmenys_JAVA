import java.util.Scanner;

public class LT04_vieno_sk_suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int suma = 1;
		int kiek = 0;
		int ats, num; // skaiciaus pavieniu skaiciu suma

		System.out.println("Skaičius:");
		int n = reader.nextInt();

		System.out.println("Įveskite sumą:");
		while (true) {
			num = reader.nextInt();

			if (num != 0) {
				if (sumOfDigits(num) == n) {
					kiek++;
				}
			}

			if (num == 0) {
				System.out.println("skaičių, kurių skaitmenų suma lygi duotajam natūraliajam skaičiui " + n + " yra "
						+ kiek + ".");

				break;
			}
		}
	reader.close();		
	}

	public static int sumOfDigits(int num) {
		int suma = 0;
		int psk;

		while (num > 0) {
			psk = num % 10;
			suma = suma + psk;
			num = num / 10;
		}
		return suma;
	}
}
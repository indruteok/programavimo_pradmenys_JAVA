import java.util.Scanner;

public class KTU01_05_kodavimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite keturių skaitmenų skaičių:");
		int sk = rd.nextInt();

		int sum = 0;
		int num = sk;
		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}

		System.out.println("Skaitmenų suma:  " + sum);
	}
}
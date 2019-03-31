import java.util.Scanner;

public class uzd09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Skaičius iš trijų skaitmenų:");
		int N = reader.nextInt();
		reader.close();

//	    int sum = 0;
//	    int num = N;
//	    while (num > 0) {
//	        int lastDigit = num % 10;
//	        sum += (int)Math.pow(lastDigit,3);
//	        num /= 10;
//		
		int sk1 = N / 100;
		int sk2 = (N - (sk1 * 100)) / 10;
		int sk3 = N - ((sk1 * 100) + (sk2 * 10));

		int ats1 = (int) Math.pow(sk1, 3);
		int ats2 = (int) Math.pow(sk2, 3);
		int ats3 = (int) Math.pow(sk3, 3);

		int sum = ats1 + ats2 + ats3;

		if ((N == sum)) {
			System.out.println("Triženklis skaitmuo yra Armstrongo ");
		} else {
			System.out.println("Triženklis skaitmuo nėra Armstrongo skaičius  ");

		}
	}
}

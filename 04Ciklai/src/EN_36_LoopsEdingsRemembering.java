import java.util.Scanner;

public class EN_36_LoopsEdingsRemembering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		int suma = 0;
		int kiek = 0;
		double average = 0;
		int even = 0;
		int odd = 0;

		System.out.println("Type the numbers:");
		while (true) {
			int num = reader.nextInt();

			if (num != -1) {
				suma = suma + num;
				kiek++;
				average = (double) suma / kiek;

				if (num % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (num == -1) {
				System.out.println("Thank you and see you later!");
				System.out.println("The sum is " + suma);
				System.out.println("How many numbers:  " + kiek);
				System.out.println("Average:  " + (double) average);
				System.out.println("Even numbers: " + even);
				System.out.println("Odd numbers: " + odd);

				break;
			}
		}
		reader.close();
	}

}

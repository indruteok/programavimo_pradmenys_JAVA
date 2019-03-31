import java.util.Scanner;

public class KTU06_05_Braskes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("kiek dienų dirbs");
		int n = reader.nextInt();
		int kiek = 0;
		int sum = 0;

		for (int i = 1; kiek < n; i++) {
			kiek++;

			System.out.println("kiek priskindavo:");
			int a = reader.nextInt(); // vaida
			int b = reader.nextInt(); // Gytis
			int c = reader.nextInt(); // Jonas
			int d = reader.nextInt(); // Rasa

			sum = sum + a + b + c + d;

			if (a == b && a == c && a == d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Vaida, Gytis, Jonas, Rasa");
			} else if (a == b && a == c) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Vaida, Gytis, Jonas");
			} else if (a == b && a == d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Vaida, Gytis, Rasa");
			} else if (a == c && a == d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Vaida, Jonas, Rasa");
			} else if (b == c && b == d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Gytis, Jonas, Rasa");
			} else if (c == d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Jonas, Rasa");
			} else if (b == d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Gytis, Rasa");
			} else if (a == d && a > b && a > c) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Vaida, Rasa");
			} else if (b == c && b > a && b > d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Gytis, Jonas");
			} else if (a > b && a > c && a > d) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Vaida");
			} else if (b > c && b > d && b > a) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Gytis");
			} else if (c > b && c > d && c > a) {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Jonas");
			} else {
				System.out.println("Daugiausiai braškių per " + kiek + " dieną priskynė Rasa");
			}

		}
		System.out.println("Vaikai per " + n + " dienų priskynė " + sum + " kg. braškių.");

	}
}

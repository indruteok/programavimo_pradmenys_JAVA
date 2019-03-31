import java.util.Scanner;

public class uzd10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite metus :");
		int metai = reader.nextInt();
		System.out.println("Įveskite mėnesį :");
		int menuo = reader.nextInt();
		reader.close();

		int d = 0;
		boolean keliamieji = (metai % 4 == 0 && metai % 100 != 0) || (metai % 400 == 0);

		switch (menuo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			d = 31;

			break;
		case 2:
			if (keliamieji)
				d = 29;
			else
				d = 28;

			break;
		case 4:
		case 6:
		case 9:
		case 11:
			d = 30;
			break;
		default:
			String response = "Netikslūs duomenys";
			System.out.println(response);
			System.exit(0);
		}
		String response = +metai + " metų " + menuo + " mėnuo turi " + d + " dienas/-ų/-ą.";
		System.out.println(response); // new line to show the result to the screen.
	}
}

import java.util.Scanner;

public class Uzd03_11LT_Tik_vienas_and {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaiciu:");
		int a = reader.nextInt();

		System.out.println("Įveskite skaiciu:");
		int b = reader.nextInt();

		System.out.println("Įveskite skaiciu:");
		int c = reader.nextInt();
		reader.close();

		if (((a > 100) && (b < 100) && (c < 100)) || ((a < 100) && (b > 100) && (c < 100))
				|| ((a < 100) && (b < 100) && (c > 100))) {
			System.out.print("Tik vienas triženklis");
		} else if ((a < 100) && (b < 100) && (c < 100)) {
			System.out.print("Nera nei vieno triženklis");
		} else {
			System.out.print("Daugiau nei vienas triženklis ");
		}

	}
}

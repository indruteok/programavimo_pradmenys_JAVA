import java.util.Scanner;

public class uzd08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite kiek buvo valandų kai traukinys išvyko : ");
		int a = rd.nextInt();
		System.out.println("Įveskite kiek buvo minučių kai traukinys išvyko : ");
		int b = rd.nextInt();
		System.out.println("Keliones trukmė valandomis: ");
		int v = rd.nextInt();
		System.out.println("Keliones trukmė minutėmis ");
		int m = rd.nextInt();

		rd.close();

		int h1 = a + v;

		int min1 = b + m;

		System.out.println(" --------------------------------");
		System.out.println("Įvesta: Keliones pradzia " + a + ":" + b + ", trukme " + v + ":" + m + ".");

		if ((h1 > 24) && (min1 > 60)) {
			System.out.println("Gauta: " + (h1 - 24 + 1) + "val.  " + (min1 - 60) + "min");
		} else if ((h1 > 24) && (min1 < 60)) {
			System.out.println("Gauta: " + (h1 - 24) + "val. " + min1 + "min");
		} else if ((h1 < 24) && (min1 > 60)) {
			System.out.println("Gauta: " + (h1 + 1) + "val. " + (min1 - 60) + "min");
		} else if ((h1 < 24) && (min1 < 60)) {
			System.out.println("Gauta: " + h1 + "val. " + min1 + "min");
		} else {
			System.out.println("Duomenų įvedimo klaida");
		}

		// jei pereina tik per viena para. konvertavimas i minutes ir dalinama kiek para
		// turi minuciu.

		System.out.println(" --------------------------------");

	}
}

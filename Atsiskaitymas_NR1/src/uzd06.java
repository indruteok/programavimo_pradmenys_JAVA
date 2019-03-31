import java.util.Scanner;

public class uzd06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Mato ūgis centimetrais:");
		int u1 = reader.nextInt();
		System.out.println("Domo ūgis centimetrais:");
		int u2 = reader.nextInt();
		System.out.println("Tomo ūgis centimetrais:");
		int u3 = reader.nextInt();
		reader.close();

		System.out.println("_________________________________________________________________");
		System.out.println("Įvesta: " + u1 + ", " + u2 + ", " + u3);

		if ((u1 == u2) && (u2 == u3)) {
			System.out.println("Mato,Domo ir Tomo ūgiai yra vienodi ");
			System.out.println("__________________________________________________________________");
		} else if ((u1 == u2) && (u1 > u3) && (u2 > u3)) {
			System.out.println("Mato ir Domo ūgiai yra lygūs ir jie aukščiausi ");
			System.out.println("__________________________________________________________________");
		} else if ((u1 == u3) && (u1 > u2) && (u3 > u2)) {
			System.out.println("Mato ir Tomo ūgiai yra lygūs ir jie aukščiausi ");
			System.out.println("__________________________________________________________________");
		} else if ((u2 == u3) && (u2 > u1) && (u3 > u1)) {
			System.out.println("Domo ir Tomo ūgiai yra lygūs ir jie aukščiausi ");
			System.out.println("__________________________________________________________________");
		} else if ((u1 > u2) && (u1 > u3)) {
			System.out.println("Matas yra aukščiausias ");
			System.out.println("__________________________________________________________________");
		} else if ((u2 > u1) && (u2 > u3)) {
			System.out.println("Domas yra aukščiausias ");
			System.out.println("__________________________________________________________________");
		} else {
			System.out.println("Tomas yra aukščiausias ");
			System.out.println("__________________________________________________________________");

		}
	}

}

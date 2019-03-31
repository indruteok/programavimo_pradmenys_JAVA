import java.util.Scanner;

public class KTU01_06_Trapecija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Trapecijos ilgesniojo pagrindo ilgis?");
		int a = reader.nextInt();

		System.out.println("Trapecijos trumpesniojo pagrindo ilgis?");
		int b = reader.nextInt();

		System.out.println("Trapecijos aukštinės ilgis?");
		int h = reader.nextInt();

		int ats = (a + b) / 2 * h;

		System.out.println("Trapecijos plotas: " + ats);
		reader.close();
	}
}
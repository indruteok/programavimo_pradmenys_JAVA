import java.util.Scanner;

public class KTU08_02_Plyteles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("plytelės ilgis (cm)");
		int x = reader.nextInt();
		System.out.println("plytelės plotis  (cm)");
		int y = reader.nextInt();

		System.out.println("pgrindų ilgis (m)");
		int sx = reader.nextInt();
		System.out.println("grindų plotis  (m)");
		int sy = reader.nextInt();

		int ats = plyteliuReikes(x, y, sx, sy);
		System.out.println("Plytelių reikės: " + ats);
	}

	public static int plyteliuReikes(int x, int y, int sx, int sy) {

		return (sx * 100 * sy * 100) / (x * y);
	}
}

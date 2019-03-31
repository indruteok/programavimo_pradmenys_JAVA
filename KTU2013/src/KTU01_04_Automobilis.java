import java.util.Scanner;

public class KTU01_04_Automobilis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Koks automobilio greitis?");
		double v = reader.nextInt();

		double ats = (0.264 / v) * 60 * 60;

		System.out.println("Automobilis tunelį pravažiuoja per " + ats + " s");

		reader.close();

	}

}

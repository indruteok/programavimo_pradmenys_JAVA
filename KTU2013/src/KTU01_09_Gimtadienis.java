import java.util.Scanner;

public class KTU01_09_Gimtadienis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek sausainių iškepė Tautvydas?");
		int a = reader.nextInt();
		System.out.println("Keli draugai atsinešė dar po tik pat sausainių?");
		int b = reader.nextInt();
		System.out.println("Kiek žmonių iš viso dalyvavo šventėje?");
		int c = reader.nextInt();

		int ats = (a + b * a) / c;
		int ats1 = (a + b * a) % c;

		System.out.println("Kiekvienas dalyvis gavo po " + ats + " sausainius.");
		System.out.println("Tautvydui papildomai atiteko " + ats1 + " sausainiai");

		reader.close();
	}
}

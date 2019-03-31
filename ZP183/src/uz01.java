import java.util.Scanner;

public class uz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek pamokų pirmadienį?");
		int x1 = reader.nextInt();
		System.out.println("Kiek pamokų antradieni?");
		int x2 = reader.nextInt();
		System.out.println("Kiek pamokų trečiadienį?");
		int x3 = reader.nextInt();
		System.out.println("Kiek pamokų ketvirtadienį?");
		int x4 = reader.nextInt();
		System.out.println("Kiek pamokų penktadienį?");
		int x5 = reader.nextInt();

		int ats = x1 + x2 + x3 + x4 + x5;
		int ats1 = ats * 45;

		System.out.println("Pamokų skaičius " + ats);
		System.out.println("Tai sudaro minučių " + ats1);
		reader.close();
	}

}

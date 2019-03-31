import java.util.Scanner;

public class KTU01_08_Keltas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Automobilų skaičius?");
		int k = reader.nextInt();
		System.out.println("Į keltą telpa automobilių:");
		int m = reader.nextInt();

		int ats = k / m;
		int ats1 = k % m;

		System.out.println("Perkels per kartų: " + ats);
		System.out.println("Liks neperkelta " + ats1);

		reader.close();
	}
}

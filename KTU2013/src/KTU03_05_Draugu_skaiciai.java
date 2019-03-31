import java.util.Scanner;

public class KTU03_05_Draugu_skaiciai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
//		System.out.println("Kiek egluciu atvesta:");
//		int n = reader.nextInt();

		int kiek = 0;
		int sk = 1;

		System.out.println("Įveskite draugų sugalvotus skičius:");
		for (sk = 1; kiek <= 10; sk++) {
			sk = reader.nextInt();
			if (sk % 2 == 0) {
				kiek++;
			}
			System.out.println("Atsakymas:" + kiek);
		}
		System.out.println("Atsakymas: Nėra");

		reader.close();
	}
}

neuzabaiga ciklo
ir neraso Nera

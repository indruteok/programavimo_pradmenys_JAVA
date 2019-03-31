import java.util.Scanner;

public class KTU01_07_Puodeliu_pakavimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Puodelių, kuriuos reikia supakuoti, skaičius:");
		int m = reader.nextInt();

		int ats = m / 3;
		int ats1 = m % 3;

		System.out.println("Pilnų dėžučių skaičius: " + ats);
		System.out.println("Nesupakuotų puodelių skaičius: " + ats1);
		reader.close();
	}
}

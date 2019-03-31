import java.util.Scanner;

public class KTU02_08_Skaiciai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskit a reikšmę");
		int a = rd.nextInt();
		System.out.println("Įveskit b reikšmę");
		int b = rd.nextInt();
		System.out.println("Įveskit c reikšmę");
		int c = rd.nextInt();
		
		if (a % 3 == 0  )  {
			System.out.print("Atsakymas " + a);
		} else if (b % 3  == 0  ) {
			System.out.println( "Atsakymas " + b );
		} else if (c % 3 == 0  ) {
			System.out.println( "Atsakymas " + c );
		}
		else {
			System.out.print("Atsakymas: nėra");
	}
		rd.close();
	}
}

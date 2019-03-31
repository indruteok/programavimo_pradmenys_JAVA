import java.util.Scanner;

public class KTU02_02_Knygos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskite dėžių skaičių:");
		int d = rd.nextInt();
		System.out.println("Įveskite knygų skaičių:");
		int k = rd.nextInt();
		System.out.println("Įveskite, kelios knygos telpa į dėžę");
		int n = rd.nextInt();
		
		int ats = k - (d*n);
		
		if ((d*n) > k ) {
			System.out.println("Knygos telpa į dėžes.");
		} else {
			System.out.println("Knygos netelpa į dėžes.");
			System.out.println("Į dėžes netilpo " + ats + " knygos/-a/-ų.");
		}
	}
}

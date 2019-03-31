import java.util.Scanner;

public class KTU04_02_Knygo_skaitymas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite pradinį puslapį");
		int p = reader.nextInt();
		
		
		
		int n=100;
		int kiek = 0; // kiek tokiu skaiciu yra
		for(p= p; p<=n ; p++ ) {
			if (p % 7 == 00 || p%17==0 ) {
			System.out.println(p);
			kiek++;		
	}
	}
		System.out.println("Viso puslapių " + kiek);
	}

}
kazkas neeveikai
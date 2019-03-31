import java.util.Scanner;

public class LT01_skaiciai_dalijasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int kiek = 0;
		
		System.out.println("Įveskite m ");
		int m =  reader.nextInt();
		System.out.println("Įveskite n");
		int n =  reader.nextInt();
		
		
		for(int i=m; i<=n; i++) {
			if(i % skaitmenuSuma(i) == 0 )
				kiek++;
		}
		
	
		System.out.println("Skaičių kiekis: " + kiek);
	}

		public static int skaitmenuSuma(int sk) {
			int suma = 0;
			int psk;
			
			while( sk > 0){
				psk = sk % 10;
				suma =suma +psk;
				sk = sk / 10;
				}

			return suma;
	
	}
}

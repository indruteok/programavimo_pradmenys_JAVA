import java.util.Scanner;

public class LT02_skaitmenu_suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite m ");
		int m =  reader.nextInt();
		System.out.println("Įveskite n");
		int n =  reader.nextInt();
		int sum = 0;
		
		for(int i=m; i<=n; i++) {
			sum =sum + skaitmenuSuma(i)  ;		
		}
		System.out.println("Skaičių kiekis: " + sum);
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

		

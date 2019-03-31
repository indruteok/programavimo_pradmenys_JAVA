import java.util.Scanner;

public class KTU06_02_Mokymosi_laikas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);


		System.out.println("kiek kartų per dieną mokėsi Jonas");
		int n = reader.nextInt();
		int kiek = 1;
		int sum = 0;
		int val ;
		int min;

		for (int i = 1; kiek <= n; i++) {
			kiek++;

			System.out.println("Kada pradėjo val:");
			int Aval = reader.nextInt();

			System.out.println("Kada pradėjo min:");
			int Amin = reader.nextInt();

			System.out.println("Kada baigė val:");
			int Bval = reader.nextInt();

			System.out.println("Kada baige min:");
			int Bmin = reader.nextInt();

			
			int laikas = (Bval * 60 + Bmin) - (Aval * 60 + Amin);
			System.out.println(laikas);
			
			sum = sum +laikas;
		}

	 val = sum /60;
	 min = sum%60;
	System.out.println(val + " val. " + min +" min. "  );
}
}


import java.util.Scanner;

public class KTU05_03_butai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Namų skaičius");
		int n = reader.nextInt();
		int kiek = 0;
		double average;
		int suma=0;

		for (int i = 1; kiek < n; i++) {
			kiek++;
		}
			System.out.println("butų skaičius b:");
			int b = reader.nextInt();
		
		
			for (int j = 1; kiek < n; j++) {
				kiek++;
			
			System.out.println("buto plotas (m2):");
			int plotas = reader.nextInt();

			suma = suma +plotas;
			
			average =  suma/b;
			
			System.out.println("Namo nr." + kiek + " butų plotų vidurkis: " +average);
			
		}
	}
}
fghjmjh
	
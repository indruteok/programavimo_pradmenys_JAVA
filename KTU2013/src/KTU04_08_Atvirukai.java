import java.util.Scanner;

public class KTU04_08_Atvirukai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
		

		int kiek = 0;
		int sum = 0;
		System.out.println("Keliems draugams Linas nori dovanoti atvirukus?: ");
		int m = reader.nextInt();
		
		System.out.println("Kiek rūšių yra parduotuvėje? ");
		int n = reader.nextInt();
		
		for(int i= 1; kiek<n ; i++ ) {
			
		System.out.println("Kiek yra  " + i + " rūšies atvirukų? ");
		 int k1 = reader.nextInt();
		 kiek++;
		 sum = sum + k1;
		}
		
		if (sum > m) {
		System.out.println( sum +  "rūšių atvirukų užteks visiems Lino draugams ");
		}
		reader.close();
	}
}

kaip padaryti kad skaiciuotu kurios rusies uztenka

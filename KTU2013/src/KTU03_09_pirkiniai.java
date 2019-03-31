import java.util.Scanner;

public class KTU03_09_pirkiniai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek buvo pirkinių:");
		int n = reader.nextInt();
		int kiek = 1;
		int sum = 0;
		int sum2 = 2;
		int average = 0;
		int lt;
		int ct;
		
		for(int i= 1; kiek<=n ; i++ ) {
			kiek++;
		System.out.println("Įveskite " + i + " pirkinio kainą ir svorį: ");
		 int kaina = reader.nextInt();
		 int svoris = reader.nextInt();
		 
		sum = sum + kaina;
		sum2 = sum2 +svoris;
		}
		average = sum / n;
		lt=average/100;
		ct=average%100;

		System.out.println("Pirkinio vidutinė kaina: " + lt + " Lt " + ct +" ct.");
		
		if (sum2 < 5000) {
			System.out.println("Petriukas galės parnešti pirkinius");
		} else {
			System.out.println("Petriukas negalės parnešti pirkinių");
		}
		reader.close();
	}

}

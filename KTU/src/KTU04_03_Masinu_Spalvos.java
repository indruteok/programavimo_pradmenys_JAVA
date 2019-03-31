import java.util.Scanner;

public class KTU04_03_Masinu_Spalvos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		double vidj =0;
		double vidm =0;
		double vidb =0;
		int kiek = 0;
			System.out.println("Įveskite automobilių kiekius:");
			while (true) {
		int j = reader.nextInt();
		int m = reader.nextInt();
		int b = reader.nextInt();
			if (j >= 0 && m >= 0 && b >= 0 ) {
			sum1 = sum1 + j;
			sum2 = sum2 + m;
			sum3 = sum3 + b;
			
			kiek++;
			
			vidj =(double)sum1 / kiek;
			vidm =(double)sum2/kiek;
			vidb =(double)sum3/kiek;
			
			}
			if ( j < 0 || m < 0 || b < 0 ) {
			System.out.println("Juodų: " + sum1);
			System.out.println("Mėlynų: " + sum2);
			System.out.println("Baltų: " + sum3);
			
			if (sum1 >sum2 && sum1>sum3) {
				System.out.println("Daugiausiai juodos ");
			} else if (sum2 >sum1 && sum2>sum3){
				System.out.println("Daugiausiai mėlynos ");
			}else {
				System.out.println("Daugiausiai baltos ");	
			}
			
			System.out.printf("Juodų kiekis per min.: %.2f ", vidj);
			System.out.println();
			System.out.printf("Mėlynų kiekis per min.: %.2f", vidm);
			System.out.println();
			System.out.printf("Baltų kiekis per min.: %.2f", vidb);
			System.out.println();
			
			break;
			}
	}
		reader.close();
	
}
}

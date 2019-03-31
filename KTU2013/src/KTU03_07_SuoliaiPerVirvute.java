import java.util.Scanner;

public class KTU03_07_SuoliaiPerVirvute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek kartų šokinėjo:");
		int m = reader.nextInt();
		int kiek = 1;
		int sum = 0;
		int average = 0;
		
		for(int i= 1; kiek<=m ; i++ ) {
			kiek++;
	
		System.out.println( "Kiek sušokinėjo kartų " + i + " bandymu:");
		int k1 = reader.nextInt();
		sum = sum + k1;
		}
		average = sum / m;
		
		System.out.println("Iš viso:  " + sum);
		System.out.println("Eglutės ukščio vidurkis:  "  + average );
		reader.close();
	}
}

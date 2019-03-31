import java.util.Scanner;

public class KTU03_04_Dviraciu_lenktynes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek ratų turėjo apvažiuoti lenktyninkai Tomas ir Matas?:");
		int r = reader.nextInt();
		System.out.println("Koks vieno rato ilgis (metrais?):");
		int ilgis = reader.nextInt();
		int kiek = 1;
		double sumT = 0;
		double sumM = 0;
		double vidT = 0;
		double vidM = 0;
		
		for(int i= 1; kiek<=r ; i++ ) {
			kiek++;
	 
		System.out.println( "Įveskite per kiek sekundžių Tomas įveikė " + i + " ratą:");
		double t1 = reader.nextDouble();
		System.out.println( "Įveskite per kiek sekundžių Matas įveikė " + i + " ratą:");
		double m1 = reader.nextDouble();
		sumT = sumT + t1;
		sumM = sumM+ m1;
		}
		vidT = ilgis / (sumT / r);
		vidM = ilgis /(sumM / r);

		System.out.printf("Tomo vidutinis greitis: %.2f m/s", vidT);
		System.out.println();
		System.out.printf("Tomas įveikė trasą per: %.1f s", sumT);
		System.out.println();
		System.out.printf("Mato vidutinis greitis: %.2f m/s", vidM);
		System.out.println();
		System.out.printf("Matas įveikė trasą per: %.1f s", sumM);
		System.out.println();
		if(sumT==sumM) {
			System.out.println("Varybos baigėsi lygiosiomis!");
		} else if (sumM<sumT) {
			System.out.println("Matas laimėjo varžybas!");
		} else {
			System.out.println("Tomas laimėjo varžybas!");
		}
		reader.close();
	}

}

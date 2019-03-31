import java.util.Scanner;

public class KTU04_05_Aiksteles_ilgis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int kiek = 0;
		int kiek2 = 0;
		
		
		while (true) {
			System.out.print("Tomo žingsio ilgis:");
		int t = reader.nextInt();
		System.out.print("Romo žingsio ilgis:");
		int r = reader.nextInt();
			if (t != r) {
				t = t + t;
				r =r +r;
				if (t == r ) {
					kiek++;	
				}
				if (r == t ) {
					kiek2++;	
				}
			}
		
			if ( t == r) {
	//		System.out.println("Aikštelės ilgs yra " +metrai +" m " + cm + " cm.");
			System.out.println("Romas nuėjo " + kiek + "žingsnius.");
			System.out.println("Tomas nuėjo " + kiek2 + "žingsnius.");
			}
			break;
		}
	
	reader.close();		
	}

}
dfghj
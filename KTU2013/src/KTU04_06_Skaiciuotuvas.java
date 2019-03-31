import java.util.Scanner;

public class KTU04_06_Skaiciuotuvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int suma = 0;
		int atimtis = 0;
		int daugyba = 0;
		int max = 0;
		int min = 99999999;
		
		System.out.println(" suma - 1, atimtis - 2, daugyba - 3, didžiausia reikšmė sraute - 4, mažiausia reikšmė sraute - 5. ");
		System.out.println("Įveskite veiksmą:");
		int nr = reader.nextInt();
		System.out.println("");
		while (true) {
			int num = reader.nextInt();
			if (num != 0) {
				if (nr == 1 ) {
					suma = suma + num;	
				}
				
				if (nr == 2 ) {
					atimtis = suma - num;	
				}
		
				if (nr == 3 ) {
					daugyba = suma * num;	
				}
				
				if (nr == 4 ) {
					if (num > max ) 
					    max = num;
					}
				
				if (nr == 5) {
					if (num < min ) 
					    min = num;
					}
			}
				if ( num == 0) {	
					
					if (nr ==1 ) 
				System.out.println("suma: " + suma );
					  if (nr == 2 ) 
				System.out.println("atimtis: " + atimtis );		
				else if  (nr==3) 
				System.out.println("daugyba: " + daugyba );
					else if  (nr==4) 
				System.out.println("max: " + max );
					else if  (nr==5) 
				System.out.println("min: " + min );

		break;
			}	
	}
		reader.close();
	}
}



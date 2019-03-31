import java.util.Scanner;

public class KTU03_02_Kelias_Mkyklon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner reader = new Scanner(System.in);
				
				System.out.println("Įveskite žingsnių kiekį iki mokyklos:");
				int n = reader.nextInt();
				
				int kiek = 0; // kiek tokiu skaiciu yra
				for( int i = 1 ;  i<=n ; i++ ) {
					if (i % 10 == 0 ) {
						kiek++;			
			}	
	}
				System.out.println("Suplojimų bus: " + kiek);	
	
	int kiek2 = 0; // kiek tokiu skaiciu yra
	for(  int a = 1 ;  a<=n ; a++ ) {
		if (a % 5 == 0 && a % 10 != 0  ) {
			kiek2++;	
}
	}
		System.out.println("Spragtelėjimų bus: " + kiek2);
				reader.close();
	}
}

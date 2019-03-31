import java.util.Scanner;

public class KTU04_05_Kurjeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int suma = 1;
		int kiek = 0;
		int average = 0;
		int kiek2 = 0;
		
		System.out.println("Įveskite sumą:");
		while (true) {
			int num = reader.nextInt();
			
			if (num != 0) {
				suma = suma + num;
				kiek++;
				average = suma / kiek;
			
			if (num >100) {
				kiek2++;	
			}
			}
	
			if ( num == 0) {
		System.out.println("1. " + kiek2 );
		System.out.println("2. " + average );
		System.out.println("3. " + kiek);
		
		break;
			}	
	}
	reader.close();		
	}
}


 


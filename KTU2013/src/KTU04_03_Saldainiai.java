import java.util.Scanner;

public class KTU04_03_Saldainiai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Petriukas gavo saldainių: ");
		int gavo = reader.nextInt();
		
		int kiek=1;
		int liko =0;
		
		System.out.println("Per dieną suvalgė: ");
		for(int i= 1; gavo>0 ; i++ ) {
			kiek++;
			int suvalge = reader.nextInt();
			
			liko = gavo-suvalge ;
		}
			if (liko > 0) {
				System.out.println("Petriukui saldainų užteks: " + kiek +" dienoms");
				System.out.println("ir jam liks: " + liko + " saldainiai");		
	}
			reader.close();	
}	
	}

neatimineja saldainiu

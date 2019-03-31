import java.util.Scanner;

public class KTU02_03_Indai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskite skysčio kiekį:");
		int x = rd.nextInt();
		
		System.out.println("Įveskite indo spindulį ir aukštį:");
		int r = rd.nextInt();
		int h = rd.nextInt();
		
		double pi=Math.PI;		
		double tūris = (pi*(r*r)*h)/1000 ;
		
	System.out.printf("Indo tūris %.2f litro.", tūris);  
	System.out.println();
		
	double netelpa = x - tūris;
	double liko = tūris-x;
	
	if (tūris <= x ) {
		System.out.println("Skystis netelpa.");
		System.out.printf("Liko nesupilta %.2f litro.", netelpa);
		System.out.println();
	} else {
		System.out.println("Skystis inde telpa. ");
		System.out.printf("Laisvos vietos liko %.2f litro", liko);
	}
	rd.close();	
	}

}

import java.util.Scanner;

public class KTU03_07_Kuro_sanaudos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite nuvažiuotų kilometrų kiekį:");
		int km = reader.nextInt();
		System.out.println("Įveskite pradinį kuro kiekį");
		int kuras = reader.nextInt();
		System.out.println("Įveskite kuro litro kainą");
		double litroKaina = reader.nextDouble();
		
		int kiek = 1;
		double sum = 0;
		double vid = 0;
		double san = 0;
		double kaina = 0;
		double ats= 0;
		double maxIsnaudota = 0;
		double did = 0;
		
		for(int i= 1; kiek<=km ; i++ ) {
			kiek++;
	 
		System.out.println( "Kiek liko kuro po " + i + " kilometro:");
		double likoKuro = reader.nextDouble();
		
		if (50 - likoKuro > maxIsnaudota) {
		    maxIsnaudota = (50 - likoKuro);
		    System.out.println(maxIsnaudota);
		}
		likoKuro = 50-likoKuro;
		
		
		sum = 50-likoKuro;
		//System.out.println(likoKuro);
	
		}
		
		ats = 50-sum;
		san = (ats*100)/km;
		kaina = ats * litroKaina;
		vid = kaina/km;
		did = maxIsnaudota * kaina;
		
		System.out.printf("Kuro sąnaudos %.3f litrų 100/km ", san);
		System.out.println();
		System.out.printf("Kelionės kaina %.2f Eur ", kaina);
		System.out.println();
		System.out.printf("Kilometras vidutiniškai kainuoja %.2f Eur ", vid);
		System.out.println();
		System.out.println("max: " + maxIsnaudota );
		System.out.println("Didžiausos sąnaudos kilometrui: " + did );
		reader.close();
	}
}

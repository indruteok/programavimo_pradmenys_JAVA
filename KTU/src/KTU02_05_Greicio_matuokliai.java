import java.util.Scanner;

public class KTU02_05_Greicio_matuokliai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite atstumą tarp matuoklių:");
		int a = reader.nextInt();
		
		System.out.println("Įveskite pirmo matuoklio uţfiksuotą laiką:");
		int v = reader.nextInt();
		int min = reader.nextInt();
		
		System.out.println("Įveskite antro matuoklio uţfiksuotą laiką:");
		int v2 = reader.nextInt();
		int min2 = reader.nextInt();
		
		System.out.println("Įveskite leistiną greitį (km/h):");
		int m = reader.nextInt();
		
		int greitis = a*60/((v2*60+min2)-(v*60+min));
		
		if ((greitis <= m ) && ((v>0) && (v<23)) && ((v2>0) && (v2<23)) && ((min>0) && (min<60)) && ((min2>0) && (min2<60))) {
			System.out.println("Apskaičiuotas greitis: " + greitis+ " km/h:");	
			System.out.println("Greitis nebuvo viršyta.");
		}  else if ((greitis+10 <= m )  && ((v>0) && (v<23)) && ((v2>0) && (v2<23)) && ((min>0) && (min<60)) && ((min2>0) && (min2<60))) {
			System.out.println("Apskaičiuotas greitis: " + greitis+ " km/h:");	
			System.out.println("Greitis viršytas"+ (greitis-m) +" km/h.");
		}  else if ((greitis+10 > m )  && ((v>0) && (v<23)) && ((v2>0) && (v2<23)) && ((min>0) && (min<60)) && ((min2>0) && (min2<60))) {
			System.out.println("Apskaičiuotas greitis: " + greitis+ " km/h:");	
			System.out.println("Greitis viršytas "+ (greitis-m) +" km/h.");
		System.out.println("Skirama bauda.");
		} else {
		System.out.println("Įvesti klaidingi duomenys.  ");

		
	}
	}
}

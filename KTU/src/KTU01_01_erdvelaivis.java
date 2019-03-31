import java.util.Scanner;

public class KTU01_01_erdvelaivis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskit erdvėlaivio greitį (km/h):");
		double v = rd.nextDouble();
		System.out.println("Įveskite atstumą iki žvaigždės (šviesmečiais):");
		double x = rd.nextDouble();
		
		double ats = x*(300000/((v/60)/60));
		
		System.out.printf("Laikas iki žvaigždės %.2f metų", ats);
		
	}
}


import java.util.Scanner;

public class KTU01_06_darbo_pradzia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Kokį laiką valandomis ir minutėmis rodė laikrodis, kai prasidėjo pamoka?");
		int v = rd.nextInt();
		int m = rd.nextInt();
		
		System.out.println("Kiek minučių mokiniai skyrė kartojimo užduotims?");
		int k = rd.nextInt();
		
		System.out.println("Kiek minučių buvo skirta naujų dalykų aiškinimuisi?");
		int n = rd.nextInt();
		
		
		int ats = (v*60 +m+k+n)/60 ;
		int ats1 = (v*60 +m+k+n)%60 ;
		
		
		System.out.println("Savarankiškas darbas prasidėjo  " + ats + " val. " + ats1 + " min." );
		
		rd.close();	
	}

}

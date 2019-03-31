import java.util.Scanner;

public class LT03_atvirkstiniai_skaiciai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite m ");
		int m =  reader.nextInt();
		System.out.println("Įveskite n");
		int n =  reader.nextInt();
		
		for(int i=m; i<=n; i++) {
			 skaitmenysAtvirksciai(i)  ;	
			 System.out.print( skaitmenysAtvirksciai(i) + ", "  );	 
		}
	}
	
		public static int  skaitmenysAtvirksciai(int sk) {
			int psk;
			int atvirkstinis = 0;
			
			while( sk > 0){
				psk = sk % 10;
				atvirkstinis = atvirkstinis * 10 + psk;
				sk = sk / 10;
			}
			
		return atvirkstinis;

	}
}


		
	

		
		
		
		
		
		
//		int ats = atvirkstiniaiSkaiciai(36, 120);
//		System.out.println("kiekis lygus: " + ats);
//	}
//
//	public static int atvirkstiniaiSkaiciai(int m, int n) {
//		int sk = 0;
//
//		while (m <= n) {
//			int sk1 = m / 100;
//			int sk2 = (m - (sk1 * 100)) / 10;
//			int sk3 = m - ((sk1 * 100) + (sk2 * 10));
//
//			if (m < 100) {
//				sk = sk3 * 10 + sk2;
//				System.out.println(m + " atvirkstinis " + sk);
//
//			} else {
//				sk = sk1 + sk2 * 10 + sk3 * 100;
//				System.out.println(m + " atvirkstinis  " + sk);
//			}
//			m++;
//		}
//		return sk;
//	}
//}
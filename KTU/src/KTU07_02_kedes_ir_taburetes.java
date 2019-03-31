import java.util.Scanner;

public class KTU07_02_kedes_ir_taburetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);

		int k ;  // kedes 4 kojos
		int t; // taburetes 3 kojos
		
		int uzsk;
		int liko;
		int kedziu;
		
		System.out.println("kiek kojų iš viso kambaryje:");
		int n = reader.nextInt();
		
//		t = n/11; //11 koju - kai viena kede ir taburete ir sedi ant ju po zmogu
//		uzsk = (t*3)+(t*2); // kiek koju is viso kai sedi ant esanciu tabureciu
//		liko=n-uzsk; // liko koju
//		k = liko/6;
		
		k = n/11; //11 koju - kai viena kede ir taburete ir sedi ant ju po zmogu
		uzsk = (k*4)+(k*2); // kiek koju is viso kai sedi ant esanciu tabureciu
		liko=n-uzsk; // liko koju
		t = liko/5;
			
		System.out.println("Kambaryje stovi " +k +" kėdės ir " +t + " taburetės");
		
			

	}
	}


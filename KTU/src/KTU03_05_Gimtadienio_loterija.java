import java.util.Scanner;

public class KTU03_05_Gimtadienio_loterija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kiek draugų Simas pakvietė į gimtadienį?:");
		int dr = reader.nextInt();
		System.out.println("Iš kelių skaitmenų sudarytas skaičius laimingas:");
		int is = reader.nextInt();
		
		int kiek = 1;
		double sum = 0;
		int vnt = 20;
		int liko;
		int truksta;
		
		for(int i= 1; kiek<=dr ; i++ ) {
			kiek++;
		System.out.println( "Įveskite " + i + " draugo sugalvotą skaičių:");
		int sk = reader.nextInt();
		
		sum = sum + sk;
		}
		
		
		int n=1000;
		int kiekis = 0; // kiek tokiu skaiciu yra
		for(int sk= 10; sk<=is ; sk++ ) {
			//System.out.println(sk);
				kiekis++;		

		System.out.println("kiek " + kiekis);
		
		liko = vnt - dr -kiekis;
		truksta = dr + kiekis -vnt;
		System.out.println("Laimėtojų skaičius lygu: " + kiekis);
	
		if(kiek < 20) {
			System.out.println("Torto pakaks. Liks"+ liko);
		} else {
			System.out.println("Torto nepakaks truksta!");
		}
		reader.close();
	}
dffff
	}
}

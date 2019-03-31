import java.util.Scanner;

public class KTU05_04_n_pirminiu_skaiciu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pirmas a skičius");
		int a = reader.nextInt();
		
		System.out.println("kiek išspausdinti pirminių skaičių");
		int n = reader.nextInt();
		int kiek = 0;
		
		for(int i = 2; i<= n; i++ ) {  
		//	System.out.print(i + " ");
		kiek++;
		if (a == a*a-1 )
			System.out.println(i + " " + kiek);
	}

}
}
sdfgh

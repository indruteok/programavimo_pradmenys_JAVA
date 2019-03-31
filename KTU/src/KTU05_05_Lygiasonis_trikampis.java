import java.util.Scanner;

public class KTU05_05_Lygiasonis_trikampis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
		
		System.out.println("Pirmas a skičius");
		int a = reader.nextInt();
		
		System.out.println("kiek išspausdinti pirminių skaičių");
		int bp = reader.nextInt();
		int kiek = 0;
		int c=a;
		int b = a;
		
		for(int i = a; i<= bp; i++ ) {  
		//	System.out.print(i + " ");
		c++;
		if (a + b > c  )
			System.out.println(" a" + a++ +" b"  +b +" c" +c);
	}

	}

}

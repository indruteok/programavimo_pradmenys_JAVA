import java.util.*; 
import java.lang.*;

public class KTU04_04_Tarpusavyje_pirminiai_skaiciai {

			// extended Euclidean Algorithm 
			public static int gcd(int a, int b) 
			{ 
				if (a == 0) 
					return b; 
				return gcd(b%a, a); 
			} 
		// Driver Program 
			public static void main(String[] args) 
			{ 
				Scanner reader = new Scanner(System.in);
				System.out.println("Įveskite a ir b reikšmes:");
				
				int a = reader.nextInt();
				int b = reader.nextInt();
				
				int  g; 
				g = gcd(a, b); 
			/*	System.out.println("GCD(" + a + " , " + b+ ") = " + g); */
	
if (g==1) {
	System.out.println("Skaičiai " +a +" ir " + b + " tarpusavyje pirminiai" );
} else {
	System.out.println("Skaičiai " +a +" ir " + b + " tarpusavyje ne pirminiai" );
}
}
}

			

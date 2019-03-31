import java.util.Scanner;

public class uzd05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pirmas skaičius:");
		int a = reader.nextInt();
		System.out.println("Antras skaičius:");
		int b = reader.nextInt();
		System.out.println("Trečias skaičius:");
		int c = reader.nextInt();

		
		// nepatikrinta as skaiciai skirtingi 
		
		reader.close();
		
		System.out.println("_________________________________________________________________");
		System.out.println("Įvesta: " + a + ", " + b + ", " + c);
		
		if ((a < b  ) && (a < c))  {
			System.out.println( a );
		}
		else if ((b<a)&& (b<c)) {
			System.out.println(b);
		}
		else {
			System.out.println(c );
		}
	
	
		System.out.println("__________________________________________________________________");
	}

}

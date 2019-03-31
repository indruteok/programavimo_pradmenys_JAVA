import java.util.Scanner;

public class uzd03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įvestas skaičius:");
		int x = reader.nextInt();
	
		reader.close();
		double c = Math.pow(x,x);
		double ats  = 16*c +2*x;
				
		
		
		System.out.println("_________________________________________________________________");
		System.out.println("Įvesta: " + x);
		System.out.println("Gauta: " + (int) ats);
		System.out.println("__________________________________________________________________");
	}

}

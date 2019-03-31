import java.util.Scanner;

public class uzd02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		

		System.out.println("Puodelių, kuriuos reikia supakuoti, skaičius:");
		int m = reader.nextInt();
		
		reader.close();
		
		int ats = m/5 ;
		int ats1 = m%5;
		
		
		System.out.println("_________________________________________________________________");
		System.out.println("Įvesta: " + m);
		System.out.println("Gauta: pilnų dėžučių " + ats + ", nesupakuotų puodelių skaičius " + ats1 + ".");
		System.out.println("__________________________________________________________________");
	}

}

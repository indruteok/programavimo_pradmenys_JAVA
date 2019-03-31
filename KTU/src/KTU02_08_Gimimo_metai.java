import java.util.Scanner;

public class KTU02_08_Gimimo_metai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Įveskite žmogaus gimimo metus:");
		int m = reader.nextInt();

		if ((m % 4 == 0) &&  ( m % 100 != 0 )  ||   ( m % 100 == 0 )  &&  ( m % 400 == 0 ))  {
			System.out.println("Ţmogus gimė keliamaisiais metais.");
		
		} else {
			System.out.println("Ţmogus gimė nekeliamaisiais metais.");
		} 
	}
	}



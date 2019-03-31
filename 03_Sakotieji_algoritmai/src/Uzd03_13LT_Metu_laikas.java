import java.util.Scanner;

public class Uzd03_13LT_Metu_laikas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner reader = new Scanner(System.in);
		

		System.out.println("Įveskite mėnesio numerį");
		int menuo = reader.nextInt();
		reader.close();
		
		switch(menuo) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Pavasaris");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("Vasara");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("Ruduo");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("Žiema");
			break;
		default:
			System.err.println("Tokio mėnesio nėra");
		
	}

}
}

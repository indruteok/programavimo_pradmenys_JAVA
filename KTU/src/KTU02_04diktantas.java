import java.util.Scanner;

public class KTU02_04diktantas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
	
		System.out.println("Įveskite mokinio padarytų klaidų kiekį::");
		int klaidos = reader.nextInt();
		
		switch(klaidos) {
		case 2:
			System.out.println("Gerai");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("Mokinio gautas įvertinimas: Patenkinamai");
			break;
		default:
			System.out.println("Mokinio gautas įvertinimas: Nepatenkinamai");
		}
		
		reader.close();	
	}

}

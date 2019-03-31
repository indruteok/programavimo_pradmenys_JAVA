import java.util.Scanner;

public class Uzd03_12LT_oru_stebejimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaičių nuo 1 iki 4:");
		int grade = reader.nextInt();
		reader.close();

		switch (grade) {
		case 1:
			System.out.println("Saulėta");
			break;
		case 2:
			System.out.println("Lietinga");
			break;
		case 3:
			System.out.println("Vėjuota");
			break;
		case 4:
			System.out.println("Sniegas");
			break;
		default:
			System.out.println("Tokio kodo nėra");
		}

	}
}

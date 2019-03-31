import java.util.Scanner;

public class Uzd03_14LT_Skaiciuotuvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite pirmą skaičių");
		int x = reader.nextInt();
		System.out.println("Įveskite antrą skaičių");
		int y = reader.nextInt();
		System.out.println("Įveskite operacijos simbolį");
		char oper = reader.next().trim().charAt(0);

		reader.close();

		int ats;

		switch (oper) {
		case '+':
			System.out.println(ats = x + y);
			break;
		case '-':
			System.out.println(ats = x - y);
			break;
		case '*':
			System.out.println(ats = x * y);
			break;
		case '/':
			System.out.println(ats = x / y);
			break;
		default:
			System.err.println("neatpažintas operacijos simbolis");
		}

	}
}

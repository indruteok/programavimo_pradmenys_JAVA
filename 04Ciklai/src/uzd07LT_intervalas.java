import java.util.Scanner;

public class uzd07LT_intervalas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaičių nuo:");
		int a = reader.nextInt();

		System.out.println("Įveskite skaičių iki:");
		int b = reader.nextInt();

//		int i=a;
//		while (i<=b) {
//			System.out.print(i + " ");
//			i++;

		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}
}

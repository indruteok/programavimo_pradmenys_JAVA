import java.util.Scanner;

public class uzd06LT_skaiciuSeka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaičių:");
		int sk = reader.nextInt();

//		int i=1;
//		while (i<=sk) {
//			System.out.print(i + " ");
//			i++;

		for (int i = 1; i <= sk; i++) {
			System.out.print(i + " ");
		}
	}
}

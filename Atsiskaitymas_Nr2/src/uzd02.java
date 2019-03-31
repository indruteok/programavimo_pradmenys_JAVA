import java.util.Scanner;

public class uzd02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.println("Įvesta:");
		int nuo = reader.nextInt();
		int iki = reader.nextInt();

		while (nuo < iki) {
			nuo++;
			if (nuo % 2 == 0)
				sum = sum + nuo;
		}

		System.out.println("Gauta: " + sum);
		reader.close();
	}
}

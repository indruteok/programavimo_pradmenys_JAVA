import java.util.Scanner;

public class uzd08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite metų intervalą:");
		int m = reader.nextInt();
		int n = reader.nextInt();
		int kiek = 0;

		for (int i = 1950; i < n; i = i + 4) {
			kiek++;
			if (i > m)
				System.out.println(i + " " + kiek);
		}
		reader.close();
	}

}

import java.util.Scanner;

public class KTU08_04_laimingibilietai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite m ");
		int m = reader.nextInt();
		System.out.println("Įveskite n");
		int n = reader.nextInt();
		
		int kiek = 0;
		
		for (int i = m; i <= n; i++) {

			if (i == skaitmenysAtvirksciai(i))
				kiek++;

			System.out.print(kiek);
		}
	}

	public static int skaitmenysAtvirksciai(int sk) {
		int psk;
		int atvirkstinis = 0;

		while (sk > 0) {
			psk = sk % 10;
			atvirkstinis = atvirkstinis * 10 + psk;
			sk = sk / 10;
		}

		return atvirkstinis;
	}

}
kjhgfdg
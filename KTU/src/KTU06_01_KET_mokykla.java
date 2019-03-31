import java.util.ArrayList;
import java.util.Scanner;

public class KTU06_01_KET_mokykla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("vairavimo mokyklos mokinių skaičius ");
		int n = reader.nextInt();
		int kiek = 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		// double average = 0;

		
		
		
		for (int i = 1; kiek <= n; i++) {
			kiek++;

			System.out.println("Trys vieno besimokančiojo vairuoti vertinimai");

			int e1 = reader.nextInt();
			int e2 = reader.nextInt();
			int e3 = reader.nextInt();
			System.out.println("Geriausias " +(kiek-1) +" mokinio įvertinimas: " + Did(e1, e2, e3));
			
		}
	}

	public static int Did(int e1, int e2, int e3) {
		if (e1 >= e2 && e1 >= e3) {
			return e1;
		} else if (e2 >= e1 && e2 >= e3) {
			return e2;
		} else {
			return e3;
		}
	}

//		reader.close();
}



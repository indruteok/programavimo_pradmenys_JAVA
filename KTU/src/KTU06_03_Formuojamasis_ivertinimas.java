import java.util.Scanner;

public class KTU06_03_Formuojamasis_ivertinimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);


		System.out.println("kiek mokinių vertinama");
		int n = reader.nextInt();
		int kiek = 1;
		int sum = 0;
		
		for (int i = 1; kiek <= n; i++) {
			kiek++;

			System.out.println("trys pazymiai:");
			int paz1 = reader.nextInt();
			int paz2 = reader.nextInt();
			int paz3 = reader.nextInt();

			int vidurkis = (paz1+paz2+paz3)/3+1;
			System.out.println(vidurkis);
		
		}

}
}

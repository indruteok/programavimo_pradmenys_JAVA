import java.util.Scanner;

public class KTU04_01_Voveryte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sukauptas riešutų kiekis x ");
		int x = reader.nextInt();
		System.out.println("Voveriukų skičius v ");
		int v = reader.nextInt();
		
		int sum = x /((v+1)*3);
		
		System.out.println("Riešutų sukaupta " + sum + " dienoms / -ų");
		
		if (sum >= 92) {
			System.out.println("Riešutų užteks vsai žiemai");
		} else {
			System.out.println("Riešutų neužteks vsai žiemai");
		}
		reader.close();
	}

}

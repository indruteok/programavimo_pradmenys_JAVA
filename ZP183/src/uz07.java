import java.util.Random;
import java.util.Scanner;

public class uz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("kiek išspausdinti žvaigždžių");
		int kiek = reader.nextInt();
		spausdinkZvaigzde(kiek);

	}

	public static void spausdinkZvaigzde(int kiek) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kiek; i++) {
			if (i != kiek - 1) {
				System.out.print("*");
			} else {
				System.out.print("*");
			}
		}
	}
}

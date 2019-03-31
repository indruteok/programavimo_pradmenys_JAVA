import java.util.Scanner;

public class uz09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = 5;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];

		System.out.println("įveskite arr1 masyvo skaičius");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(i + " elementui suteikiama reikšmė -");
			arr1[i] = reader.nextInt();
		}

		System.out.println("įveskite arr1 masyvo skaičius");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(i + " elementui suteikiama reikšmė -");
			arr2[i] = reader.nextInt();
		}

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] * arr2[i];
		}

		masyvoSpausdinimas(arr1);
		masyvoSpausdinimas(arr2);
		masyvoSpausdinimas(arr3);

	}

	private static void masyvoSpausdinimas(int[] arr1) {
		for (Integer n : arr1) { // n- bet koks pavadinimas
			System.out.print(n + " ");
		}
		System.out.println();

	}

}

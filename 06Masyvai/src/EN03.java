import java.util.Arrays;
import java.util.Scanner;

public class EN03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a boolean method called contains(), which takes an array of init and an int: and returns true if the array contains the given int.
//		The method's signature is as follows:
//		public static boolean cotains(int[] array, int key);
//		also write a test driver to test this metod

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite masyvo dydi");
		int n = reader.nextInt();

		int[] array = new int[n];

		int a = 1;
		int b = 50;

		createArr(array, a, b);
		System.out.println(Arrays.toString(array)); // spaudina masyva

		System.out.println("Įeškomas skačius");
		int key = reader.nextInt();

		System.out.println(contains(array, key));
	}

	private static boolean contains(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] == key)
					return true;

			}
		}

		return false;
	}

	private static void createArr(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
	}
}

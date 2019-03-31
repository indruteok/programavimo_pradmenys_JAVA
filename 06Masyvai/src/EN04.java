import java.util.Arrays;
import java.util.Scanner;

public class EN04 {

	public static void main(String[] args) {
		// susrasti kurioje vietoje yra ieskomas elementas
//		Write a metod called search(), which takes an array of int and a int; and returns the array index if the array contains the given int; 
//		or -1 otherwise. The method's signature is as follows;
//		public static int search(int[] array, int key);
//		Also write a test driver to test this method.

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite masyvo dydį");
		int n = reader.nextInt();

		int[] array = new int[n];

		int a = 1;
		int b = 10;

		createArr(array, a, b);
		System.out.println(Arrays.toString(array)); // spaudina masyva

		System.out.println("Įeškomas skačius");
		int key = reader.nextInt();

		int retVal = search(array, key); // suranda kelintoj vietoj ieskomas skaicius
		System.out.println("The index of element " + key + " is : " + retVal);
	}

	private static int search(int[] array, int key) {
		// TODO Auto-generated method stub
		int vieta = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				vieta = i;
			}
		}

		return vieta;
	}

	private static void createArr(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
	}

}

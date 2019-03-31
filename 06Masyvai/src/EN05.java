import java.util.Arrays;
import java.util.Scanner;

public class EN05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// surasti ar masyvai vienodi
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite masyvo dydį");
		int n = reader.nextInt();

		int[] array1 = new int[n];
		int[] array2 = new int[n];

		int a = 1;
		int b = 3;
		int c = 1;
		int d = 3;

		createArr(array1, a, b);
		System.out.println(Arrays.toString(array1)); // spaudina masyva

		createArr(array2, c, d);
		System.out.println(Arrays.toString(array2)); // spaudina masyva

		equals(array1, array2);
		System.out.println("ar masyvai vienodi? ");
		System.out.println(equals(array1, array2));

	}

	private static boolean equals(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		{
			if (array1.length != array2.length) {
				return false;
			}
			for (int i = 0; i < array1.length; ++i) {
				if (array1[i] != array2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	private static void createArr(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
	}

}

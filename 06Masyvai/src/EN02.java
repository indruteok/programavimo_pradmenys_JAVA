
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EN02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite masyvo dydi");
		int n = reader.nextInt();
		int[] array = new int[n];

		int a = 1;
		int b = 50;

		createArr(array, a, b);

		arrayToSting(array);
		System.out.println(Arrays.toString(array)); // spaudina masyva

	}

	private static String arrayToSting(int[] array) {
		return Arrays.toString(array);
	}

	private static void createArr(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
	}
}

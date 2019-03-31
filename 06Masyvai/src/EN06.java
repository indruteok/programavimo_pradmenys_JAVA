import java.util.Arrays;

public class EN06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a boolean method called copy, which takes an int Array and returns a
		// copy of the given array.
		// The method's signture is as follow

		int[] array = new int[5];
		int[] array2 = new int[5];

		int a = 1;
		int b = 10;

		createArr(array, a, b);
		System.out.println(Arrays.toString(array)); // spaudina masyva

		copyOf(array);
		System.out.println(Arrays.toString(copyOf(array)));
	}

	private static int[] copyOf(int[] array) {
		// TODO Auto-generated method stub
		int[] arrayC = new int[array.length];
		for (int i = 0; i < arrayC.length; i++) {
			arrayC[i] = array[i];
		}

		return array;
	}

	private static void createArr(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class EN01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a method called print(), which takes an int array and print its contents in the form of [14, a2 ..]. Take note that there is no comma after the last element. The method's signature os as follows
//
//		Also write a test driver to test this method (you should test on emty array, one-element array, and n- element array).
//		hoe to handle double [] of float[]? yuo need to write a overloaded version for double[] and a overloaded version for float[], with the following signaturas:	
//		the above is known as method overloading, where the same method name can have many version, differentiated by its parameter list.
//		for the first element, print its value: for subsequent elements, print commas followed by the value
//		
		
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite masyvo dydi");
		int n = reader.nextInt();
		int[] array = new int[n];

		int a = 1;
		int b = 50;

		createArr(array, a, b);
//		System.out.println(Arrays.toString(array));     spaisdina sukurta masyva
//		System.out.println();

		print(array);

	}

	private static void print(int[] array) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length - 1] + "]");
		System.out.println();
	}

	private static void createArr(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
//		Random r = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = a + r.nextInt(b);
//		}
	}
}

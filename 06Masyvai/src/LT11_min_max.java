import java.util.Arrays;
import java.util.Random;

public class LT11_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 100;
		int min = -50;

		int[] arr = new int[70];
		randomArr(arr, min, max);
		printArr(arr);

		int didR;
		int mazR;

		System.out.println(" "); // kad min ir did kitoje eiluteje spauintu

		didR = raskDidziausiaReiksme(arr);
		mazR = raskMaziausiaReiksme(arr);

		int didReiksmesVieta;
		int mazReiksmesVieta;

		didReiksmesVieta = raskReksmesVieta(arr, didR);
		mazReiksmesVieta = raskReksmesVieta(arr, mazR);

		System.out.println("Did r " + didR + "Did vieta " + didReiksmesVieta);
		System.out.println("Maz r " + mazR + "Did vieta " + mazReiksmesVieta);

	}

	private static int raskReksmesVieta(int[] arr, int reiksme) {
		int vieta = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == reiksme) {
				vieta = i;
			}
		}

		return vieta;
	}

	private static int raskMaziausiaReiksme(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	private static int raskDidziausiaReiksme(int[] arr) {
		int did = arr[0]; // -18
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > did) { // arr[1]>did -12> -18
				did = arr[i];
			}
		}

		return did;
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	private static void randomArr(int[] arr, int min, int max) {

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + r.nextInt(max); // r.nextInt(max); max80 0-79 // -30 +20 = -10

		}

	}
}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class uzdavinys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Programa prašo įvesti masyvo dydį.
//		2. Metodas - sukuria atsitiktinių reikšmių masyvą iš nurodyto intervalo [a, b],
//		a, b - įvedami iš klaviatūros.
//		Metodo antraštė: createArr(a, b, arr);
//		3. Metodas - atspausdina masyvą į eilutę, elementus atskirdamas kableliu.
//		Po paspukitnio elemento turi būti padėtas taškas.
//		1, 2, 3, 4, 5. 
//		4. Surūčiuoja masyvą didėjančiai (mažėjančiai)
//		5. Programa pateikia masyvą prieš ir po rūšiavimo.

		Scanner reader = new Scanner(System.in);
//1.
		System.out.println("Įveskite masyvo dydi");
		int dydis = reader.nextInt();
		int[] arr = new int[dydis];

//2. 
		System.out.println("Įveskite a ");
		int a = reader.nextInt();
		System.out.println("Įveskite b");
		int b = reader.nextInt();

		createArr(arr, a, b);
		System.out.println(Arrays.toString(arr));
		System.out.println();

//3.	
		printArr(arr);

// 4.
		System.out.println("Pries rusiavima: ");
		printArr(arr);
		
		bubbleSort(arr);
		

// rusiuoja didejimo tavrka	
//		Arrays.sort(arr);
//		System.out.printf("Masyvas arr[] didejancia tvarka : %s", Arrays.toString(arr));

// 5. Pries ir po rusiavimo		

		
		
		System.out.println("Po rusiavimo: ");
		printArr(arr);
		
		
		
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (arr[j - 1] > arr[j]) {     // if apsukus < tikrina atvirksttine tvarka
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}

	private static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[arr.length - 1] + ". ");
		System.out.println();
	}

	private static void createArr(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * b + a); // int todel kad sitas metodas paraso doble
		}
//		Random r = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = a + r.nextInt(b);
//		}
	}
}

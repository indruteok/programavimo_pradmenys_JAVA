import java.util.ArrayList;
import java.util.Scanner;

public class uz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		int n = 5;

		int i;
		int sk;
		System.out.println("įveskite arr1 masyvo skaičius");
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		for (i = 0; i < n; i++) {
			System.out.print(i + " elementui suteikiama reikšmė -");
			arr1.add(i, sk = reader.nextInt());
		}

		System.out.println("įveskite arr2 masyvo skaičius");
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		for (i = 0; i < n; i++) {
			System.out.print(i + " elementui suteikiama reikšmė -");
			arr1.add(i, sk = reader.nextInt());
		}

	}
}

//		ArrayList<Integer> arr3 = new ArrayList<Integer>();
//		arr1.add(0, (arr1[0]*arr2[0])); // i 4 vieta iterpti 10
//		arr1.add(1, 1);
//		arr1.add(2, 0);
//		arr1.add(3, 2);
//		arr1.add(4, 5);

//	      for (Integer num : arr1) { 		      
//	           System.out.print(num); 		
//	      }
//		

//		System.out.println("-----------------------");
//		for (i = 0; i < arr1.size(); i++) {
//			System.out.print(arr1.get(i));
//		}
//		System.out.println("-----------------------");
//		for (i = 0; i < arr2.size(); i++) {
//			System.out.print(arr2.get(i));
//		}
//		System.out.println("-----------------------");

//		System.out.println("Using Enhanced for loop");
//		System.out.println("-----------------------");
//		for (String str : arr1) {
//			System.out.println(str);
//		}

// System.out.println(ArrayList.Integer(arr1));

//		for (i = 0; i < arr1.size(); i++) {
//		     System.out.println(ArrayList.deepToString(arr1.get(i)));
//		}

//		private static void printArrayList(ArrayList<Integer> arr1) {
//			for (Integer n : arr1) { // n- bet koks pavadinimas
//				System.out.print(n + " ");
//			}
//			System.out.println();
//
//		}
//		
//		
//	}
//}

// printArrayList(arr1[]);
//
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		arr1.add(0, 9); // i 4 vieta iterpti 10
//		arr1.add(1, 1);
//		arr1.add(2, 0);
//		arr1.add(3, 2);
//		arr1.add(4, 5);
//		printArrayList(arr1); // atspausdinimo
//
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		arr2.add(0, 5); // i 4 vieta iterpti 10
//		arr2.add(1, 2);
//		arr2.add(2, 3);
//		arr2.add(3, 5);
//		arr2.add(4, 5);
//		printArrayList(arr2); // atspausdinimo
//
//	}
//

//9. Spresti suAdd- prideti size-dydis
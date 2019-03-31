import java.util.ArrayList;
import java.util.Arrays;

public class uzd01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sting tipo
		ArrayList<String> textList = new ArrayList<String>();

		// Integer tipo: is didziosios
		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(2);
		numList.add(5);
		numList.add(13);
		numList.add(59);
		numList.add(88);

//		
		System.out.println("Dydis: " + numList.size());
//		// sukurtas:
		printArrayList(numList); // atspausdinimo
//		
//	
			numList.add(4, 10); // i 4 vieta iterpti 10
			printArrayList(numList); 
		
			System.out.println("2: " + numList.get(2));   //   kokia yra reiksme nurodytoj vietoj
			
			
			System.out.println("Ar yra skaicius 14");
			System.out.println(numList.contains(14));   //  patikrina ar turi ivesta skaiciu
			System.out.println(numList);    // atsapausdina kolekcija
			
			
			printArrayList(numList);
//
//int[] = new int[6];
//
//printArr(arr);
//arr[5]= 10;
//System.out.print.ln(arr[5]);
		

	}

	private static void printArrayList(ArrayList<Integer> numList) {
// senas for		
//		for(int i=0; i<numList.size(); i++) {
//			System.out.println(numList.get[i] + " ");   // kadagi ne masyvas naudojam metoda get[i]
//		}
// maujas for
		for (Integer n : numList) { // n- bet koks pavadinimas
			System.out.print(n + " ");
		}
		System.out.println();

	}

}

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	// String tipo sąrašas
//	ArrayList<String> textList = new ArrayList<String>();
//
//	// Integer tipo sąrašas
//	ArrayList<Integer> numList = new ArrayList<Integer>();
//
//	numList.add(2); // 0
//	numList.add(5); // 1
//	numList.add(13); // 2
//	numList.add(59); // 3
//
//	System.out.println("Dydis: " + numList.size());
//
//	printArrayList(numList);
//
//	numList.add(0, 10);
//
//	printArrayList(numList);
//
//	System.out.println("2: " + numList.get(2));
//
//	System.out.println(numList.contains(14));
//
//	System.out.println(numList);
//
//	printArrayList(numList);
//	}
//
//	private static void printArrayList(ArrayList<Integer> numList) {
////		for(int i=0; i<numList.size(); i++) {
////		System.out.print(numList.get(i) + " "); // arr[i]
////		}
//	for(Integer n: numList) {
//	System.out.print(n + " ");
//	}
//	System.out.println();
//	}
//
//
//	}

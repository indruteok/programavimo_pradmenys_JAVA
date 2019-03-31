import java.util.Scanner;

public class pvz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int [] tomas = new int[5];  //int [] tomas; - deklaravimas      new int[3]- kiek reiksmiu yra; tik tie patys duomenys gali buti 
//		tomas[0] = 4;
//		tomas[1] = 9;
//		tomas[2] =7;
//		tomas[3] =6;
//		tomas[4] =7;
		
		//0 1 2, dydis =3
		System.out.println(tomas[2]);
		int ats = tomas[0] +tomas[1]; // 19
		int ats1 = tomas[ 0+1]; //  9
		double suma = 0;
		double vidurkis = 0;
		// tomo pazymiu vidurkis:

	
	//Rasti didziausia pazymi:
	
	
	int max = tomas[0];
	
	for(int i=1; i<tomas.length; i++) {
		if(tomas[i] > max) {
			max= tomas[i];
		}
}
//	tomas[1]>max      9>4  true
//	tomas[2] >max     7>9 false
//	tomas[3] >max    10>9 true
//	
	
System.out.println(max);
}

	
	
	/*Print*/
	for(int i=1; i<tomas.length; i++) {
		System.out.println(tomas[i] + " ");
	}
	
	
	
	int[] mas = new int[10];
	
	for(int i=0; i<mas.length; i++) {
	System.out.println("Ivesti masyvo elementa:");
	 mas[i] = reader.nextInt();
}

	
	int[] arr1 = {1,2,3,5,6};
	int[] arr2 = {9,9,9,8,9};
	
	int[] arr3 = new int[5];
	
	arr3[0] = arr1[0];  // kiekvienas 
	
	arr3=arr1;   // jie sudeti abu vienoje vietoje
	
	
	System.out.println("masyvas arr1 " + arr1);
	System.out.println("masyvas arr1 " + arr3));
	
	for(int i=0; i<arr1.length; i++) {
		arr3[i]= arr1[i];
	}
	
	
	
	
	
	
//	int[] mas  -   int mas[]; tas pats
}
}
	
	
	
	
	
	


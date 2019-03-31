import java.util.Scanner;

public class uzd09LT_daugybosLentele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite skaičių:");
		int sk = reader.nextInt();

//		int i=1;
//		int ats=1;
//		
//		while (i<10) {
//			System.out.println(sk + " * " + i + " " +" = "+ (ats=sk*i));
//			i++;

		int ats = 1;
		for (int i = 1; i < 10; i++) {
			System.out.println(sk + " * " + i + " " + " = " + (ats = sk * i));

		}
	}

}

import java.util.Scanner;

public class KTU02_06_Saulys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite taikinio centro koordinates x0 ir y0:");
		int x0 = reader.nextInt();
		int y0 = reader.nextInt();
		
		System.out.println("Įveskite pataikymo taško koordinates x ir y:");
		int x = reader.nextInt();
		int y = reader.nextInt();
		
		
		if ((x==5 && y<=1) || (x==4 && y<=2) || (x==3 && y<=3)|| (x==2 && y<=4) || (x==1 && y<=5)) {
			System.out.println("Šaulys gaus 10 taškų");
	} else if ((x==10 && y<=1) || (x==9 && y<=2) || (x==8 && y<=3) || (x==7 && y<=4) ||(x==6 && y<=5) ||(x==5 && y<=4)) {
		System.out.println("Šaulys gaus 5 taškų");
	} else 
		System.out.println("Šaulys gaus 0 taškų");
}
}

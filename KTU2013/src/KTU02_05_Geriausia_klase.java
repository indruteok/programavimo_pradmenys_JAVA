import java.util.Scanner;

public class KTU02_05_Geriausia_klase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskite klasių vidurkius:");
		double a = rd.nextDouble();
		double b = rd.nextDouble();
		double c = rd.nextDouble();
		double d = rd.nextDouble();
		
		double max;
		
		if((a>b) && (a>c) && (a>d)){
			max = a;
		} else if ((b>c) && (b>a) && (b>d)){
			max = b;
		}	else if((c>b) && (c>a) && (c>d)){
				max = c;	
		}else {
			max = d;
		}
		
//					double  ats;					
//						if((max-a) !=0) {
//							 ats = max - a;
//						} else if ((max-b) !=0) {
//							 ats = max - b;
//						} else if ((max-c) !=0) {
//							 ats = max - c;
//						} else if ((max-d) !=0) {
//							 ats = max - d;
		
		
		System.out.println("Didžiausas vidurkis: " + max);
		System.out.println("Kitų klasių vidurkiai skiriasi: " + (max-a) +", " + (max-b) +", "  + (max-c) + ", "  + (max-d) + ", ");
		rd.close();
	}
	}



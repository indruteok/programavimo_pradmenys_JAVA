import java.util.Scanner;

public class KTU02_01_Pietus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Kuriuo laiku mama pradėjo gaminti pietus (valanda ir minutė)?");
		int v = rd.nextInt();
		int m = rd.nextInt();
		
		System.out.println("Kiek laiko mama gamina pietus (minutėmis)? ");
		int p = rd.nextInt();
		
		System.out.println("Kada iš lauko grįţta vaikai (valanda ir minutė)? ");
		int vv = rd.nextInt();
		int vm = rd.nextInt();
		
		
		
		if ((v*60 +m+p) <  (vv*60+vm)) {
			System.out.println("Mama pietus pagaminti spės");
		} else {
			System.out.println("Mama pietų pagaminti nespės.");
		}		
	}	
	}


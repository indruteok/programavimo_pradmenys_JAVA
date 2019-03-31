import java.util.Scanner;

public class uzd04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pinigų suma litais:");
		int lt = reader.nextInt();
		System.out.println("Pinigų suma centais:");
		int ct = reader.nextInt();

		reader.close();
		
		int sum = lt*100+ct;
		 int a, b, c, d, e, f;
		 
		 	a = sum/50;
			b = (sum - a*50 ) /20;
			c = (sum - a*50 - b*20 ) /10;
			d = (sum - a*50 - b*20 - c*10 ) /5;
			e = (sum - a*50 - b*20 - c*10 - d*5) /2;
			f = (sum - a*50 - b*20 - c*10 - e*5-e*2) /1;
		 
		
			// ga;ima su /dalyba/ ir dalyba su leikana%
			
			
			
		
		System.out.println("_________________________________________________________________");
		System.out.println("Įvesta: " + lt + " ir " + ct);
		System.out.println("Gauta: " );
		System.out.println("50 ct - " + a );
		System.out.println("20 ct - " + b );
		System.out.println("10 ct - " + c );
		System.out.println("5 ct - " + d );
		System.out.println("2 ct - " + e );
		System.out.println("1 ct - " + f );
		System.out.println("__________________________________________________________________");
	}

}

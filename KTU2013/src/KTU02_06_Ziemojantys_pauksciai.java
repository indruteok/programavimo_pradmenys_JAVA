import java.util.Scanner;

public class KTU02_06_Ziemojantys_pauksciai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Įveskite kiek kiekvienos rūšies paukščių liko žiemoti:");
		int a = rd.nextInt();
		int b = rd.nextInt();
		int c = rd.nextInt();
		
		int  max;
		
		if(( a > b ) && ( a > c )) {
			max = a;
		}else if (( b > c ) && (b > a)) {
			max = b;
		} else
			max = c;
			
		int  med;
		
		if(( a < b ) && ( a > c ) || ( a > b ) && ( a < c )) {
			med = a;
		}else if (( b < c ) && (b > a) || ( b > c ) && (b < a)){
			med = b;
		} else
			med = c;
		
		int  min;
		
		if(( a < b ) && ( a < c )) {
			min = a;
		}else if (( b < c ) && (b > a) || ( a < b) && ( a < c ) ||  ( b < c ) && (b < a))  {
			min = b;
		} else
			min = c;
		
		System.out.println( max);
		System.out.println( med);
		System.out.println( min);
		
		
		System.out.println("skirtumas tarp dižiausio ir mažiausio kiekio: "  +( max -min));
		rd.close();
		}
		
		
	}



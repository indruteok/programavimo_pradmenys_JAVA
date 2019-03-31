
public class JME_03_sum123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ats = sumOfDigits(25);
		System.out.println("The sum is " + ats);
	}

	public static int sumOfDigits(int a) {
		int suma= 0;
		int psk;
		
		while( a > 0){
			psk = a % 10;
			suma =suma +psk;
			a =a / 10;
			}

		return suma;
	
	}

}

import java.util.Scanner;

public class KTU02_07_populiariausios_knygos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite pirmosios knygos kodą ir parduotų egzempliorių skaičių:");
		int k = reader.nextInt();
		int s = reader.nextInt();
		
		System.out.println("Įveskite antrosios knygos kodą ir parduotų egzempliorių skaičių:");
		int k2 = reader.nextInt();
		int s2 = reader.nextInt();
		
		System.out.println("Įveskite trečiosios knygos kodą ir parduotų egzempliorių skaičių:");
		int k3 = reader.nextInt();
		int s3 = reader.nextInt();
		
		
		if  (s == s2 && s2==s3 && s==s3) {
			System.out.println("Populiariausios knygos " + k +", "+ k2 + ", " +k3);
		} else if  (s == s2 && s2!=s3 && s!=s3)  {
				System.out.println("Populiariausios knygos " + k +", "+ k2 );
		} else if  (s != s2 && s2!=s3 && s==s3)  {
			System.out.println("Populiariausios knygos " + k +", "+ k3 );
		} else if  (s != s2 && s2==s3 && s!=s3)  {
			System.out.println("Populiariausios knygos " + k2 +", "+ k3 );
		} else if  (s > s2  && s>s3)   {
			System.out.println("Populiariausios knygos " + k  );
		} else if    (s2 > s  && s2>s3) {
			System.out.println("Populiariausios knygos " + k2  );
		} else if  (s3 > s  && s3>s2)  {
			System.out.println("Populiariausios knygos " + k3  );
		} else {
			System.out.println("Klaidingi duomenys" );
		}
	
	}

}

import java.util.Scanner;

public class Lektuvo_bagazas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite keleivių skaičių ");
		int keleiviai = reader.nextInt();

		int kiek = 1;
		int sum =0;
		int sum1 =0;
		int sum2 =0;
		int sum3 =0;

		for (int i = 1; kiek <= keleiviai; i++) {
			kiek++;
			System.out.println("Įveskite " + i + " keleivio klasę : 0 - verslo arba 1- ekonomine");
			int klase = reader.nextInt();

			System.out.println("Įveskite rankinio bagažo aukštį ");
			int au = reader.nextInt();

			System.out.println("Įveskite rankinio bagažo plotį ");
			int pl = reader.nextInt();

			System.out.println("Įveskite rankinio bagažo ilgį ");
			int il = reader.nextInt();

			System.out.println("Įveskite rankinio bagažo svorį");
			double kg = reader.nextDouble();

			System.out.println("Įveskite bagažo svorį, jei jo nėra - 0 ");
			double kg2 = reader.nextDouble();

			if (klase == 0) {
				int virsija = au + pl + il;
				if (virsija >= 120) {
					int apmokest = (virsija - 120) * 5;
					System.out.println("virsija: " + virsija);
					System.out.println("ap: " + apmokest);
					
				//	sum=sum +virsija;
				//	sum1=sum1 +apmokest;	
					
				}
			
				
				if (klase == 1) {
					int virsija2 = au + pl + il;
					if (virsija2 >= 120) {
						int apmokest2 = (virsija2 - 120) * 10;
						System.out.println("virsija: " + virsija2);
						System.out.println("ap: " + apmokest2);
						
					//	sum3=sum3 +virsija;
					//	sum2 = sum2+ apmokest2;
					}
					
					

					System.out.println("virsija: " + sum +sum3);
					System.out.println("apmok: " + sum1 +sum2);

					// 8kg iki 120cm
					// 1 cm - 5e verslo 10e - ekonom

					// verslo iki 23kg nderibotas matmenys 1kg +5eu
					// ekonom - 1 kg 5eu

				}
			}
		}
	}
}

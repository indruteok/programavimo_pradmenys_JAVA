
public class pvz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] tomas = { 5,1,2,4,5};
		
		
		int[] rasa = {2,4,6,8,7,8};
		System.out.println(rasa.length);
	
		// apskaiciuosime pazymiu v idurki
		double vidurkis = pazymiuVidurkis(rasa);
		System.out.println("Vidurkis " + vidurkis);
		
		
		
		//prie  masyvo kiekcvieno elemento prideti dydi x
		int x = 2;
		rasa=pridekDydiX(rasa, x );
		printArray(rasa);
		
		
		
		// ar galima si tomu
		System.out.print( "Tomas ");
		printArray(tomas);
		
		tomas = pridekDydiX(tomas, x );
		
		
		
		
	}

	private static void printArray(int[] rasa) {
		for(int i=0; i <rasa.length; i++) {
			System.out.print(rasa[i] + " ");
		}
		
	}

	private static int[] pridekDydiX(int[] rasa, int x) {
		
		for(int i=0; i <rasa.length; i++) {
			rasa[i]= rasa[i]+x;
		}
		
		return rasa;
	}

	
	
	
	private static double pazymiuVidurkis(int[] rasa) {
		double suma = 0;
		
		for(int i=0; i<rasa.length; i++) {
			suma =suma + rasa[i];
			// suma = 0+2=2
			// suma =2+4=6
			//6+6=12
			//12+8= 20
			//20+7=27
			//27+8=35
		}
		
		
		 
		return (suma /rasa.length) ;
	}

}

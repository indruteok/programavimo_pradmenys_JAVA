
public class pvz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] tomas = new int[5];  //int [] tomas; - deklaravimas      new int[3]- kiek reiksmiu yra; tik tie patys duomenys gali buti 
		tomas[0] = 10;
		tomas[1] = 9;
		tomas[2] =7;
		tomas[3] =6;
		tomas[4] =7;
		
		//0 1 2, dydis =3
		
		System.out.println(tomas[2]);
		
		int ats = tomas[0] +tomas[1]; // 19
		int ats1 = tomas[ 0+1]; //  9
		
		double suma = 0;
		double vidurkis = 0;
		
		// tomo pazymiu vidurkis:
		for(int i=0; i<tomas.length; i++) {
			suma = suma+tomas[i];    //   suma=suma +tomas[0]+tomas[1]
	}
	 
	vidurkis = suma/tomas.length;
	System.out.println(vidurkis);
	}
	
	
	
	//Rasti didziausia pazymi

}

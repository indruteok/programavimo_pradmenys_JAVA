
public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// metai, spalva, modelis
		
		Car masina1 = new Car(2014, "Zalia", "Audi" );
		Car masina2 = new Car(2015, "Geltona", "Mazda" );
		Car masina = new Car(2016, "Raudona", "BMV" );
		
		masina1.printReiksmes();
		
		
		double ats  = masina1.metaiplius(10.7);
		System.out.println(ats);
	//	System.out.println(masina1.metaiplius(10));
		
		
		
		
		
		
	}

}

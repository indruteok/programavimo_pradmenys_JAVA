
public class TrikampisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Trikampis variantas1 = new Trikampis ( 7, 7, 7);
		
		double ats = variantas1.getPerimetras();
		System.out.println("perimetras - " +ats);
		
		
		double ats2 =variantas1.getPlotas();
		System.out.println("plotas - " +ats2);
		

		System.out.println(variantas1);  // jei nera toString spausdins vieta, jei yra duomenis
		//variantas1.print();
		
// pakeisto kintamojo spausdinimas
		variantas1.setA(8);
		System.out.println(variantas1);
		
		
		
		// konkretaus kintamojo ispausdinimas
		double testA =variantas1.getA();
		System.out.println(testA);
		
		
		
		
		
	}

}

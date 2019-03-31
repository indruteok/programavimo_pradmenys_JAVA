
public class Car {

	
	// laukai feelds, jie matomi visur yra globalus
	private int metai;
	private String spalva;
	private String modelis;

	// konstruktorius - metodo pavadinimas, neturi grazinamo tipo (pvz void , int) jo pavadinimas sutapt turi su klases pavadinimu

	public Car(int metai1, String spalva1, String modelis1) {
		this.metai = metai1;
		this.spalva = spalva1;
		this.modelis = modelis1;

	}

/// kiti metodai (void kazka padaro pv spaudina, int grazina, return turi buti
	public void printReiksmes() {
		System.out.println("Metai: " + metai + ", spalva " + spalva + ", modelis " + modelis);
	}

	public int metaiplius(int a) {
		metai = metai + a;
		// System.out.println("metai po" +a +"metu bus tiek " + metai);
		return metai;
	}

	public double metaiplius(double a) {

		// System.out.println("metai po" +a +"metu bus tiek " + metai);
		return (double) (metai + a);
	}

	public int metaiplius(int a, int b) {   // kas skleisteliusie ateina is main
		metai = metai + a + b;
		// System.out.println("metai po" +a +"metu bus tiek " + metai);
		return metai;
	}
}

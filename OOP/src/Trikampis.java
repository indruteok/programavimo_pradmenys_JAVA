
public class Trikampis {

	private double a;
	private double b;
	private double c;
	
	//konstruktorius
	public Trikampis(double a, double b, double c) {
		
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
	// pradiniu reiksmiu keitimas:// rasoma kiekvienam atskiram laukui atskirai
	public void setA(double a) {
		this.a=a;
}
	
	//gauti reiksme kiek lauku tiek metodu
	public double getA() {
		return a;
	}
	
	
	// peles desni, dour sgenerate seters and geters
	
	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	public double getPerimetras() {
		return (a+b+c);
	}
	
	
	public double getPlotas() {
				return (0.5*(a*b));
	}
	
	
	public void print() {
		System.out.println("a= "+ a +"b= "+ b+"c= "+ c);
	}



	@Override
	public String toString() {
		return "Trikampis [a=" + a + ", b=" + b + ", c=" + c + "]";
	}


// desnis peles, Sourse, generate to string...
	
	
	
	
	
}

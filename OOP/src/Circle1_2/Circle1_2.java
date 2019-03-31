package Circle1_2;


public class Circle1_2 {

	private double radius;
	
	public Circle1_2() {
		radius = 1.0;
	}
	
	public Circle1_2(double r) {
		radius=r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle1_2 [radius=" + radius + "]";
	}
	
	
	
	
}

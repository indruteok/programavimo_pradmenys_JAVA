package Circle1_1;

public class Circle1_1 {

	private double radius;
	private String color;
	
	
	public Circle1_1() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle1_1(double r) {
		radius=r;
		color = "red";
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		this.color = newColor;
	}

	@Override
	public String toString() {
		return "Circle1_1 [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}

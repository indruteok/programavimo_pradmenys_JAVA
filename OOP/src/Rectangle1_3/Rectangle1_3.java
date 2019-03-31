package Rectangle1_3;

public class Rectangle1_3 {

	private float lenght;
	private float width;
	
	public Rectangle1_3() {
		lenght = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle1_3(float lenght, float width) {
		lenght = 1.0f;
		width = 1.0f;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return lenght*width;
	}
	
	public double getPerimeter() {
		return (2*lenght)+(2*width);
	}

	@Override
	public String toString() {
		return "Rectangle1_3 [lenght=" + lenght + ", width=" + width + "]";
	}
	
	
	
}

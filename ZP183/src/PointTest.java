
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(2, 3);

		System.out.println("Kordinate x: " + p1.getX() + " Kordinate y: " + p1.getY());

		p1.setXY(2, 3);
		System.out.println("x ir y " + p1);

		System.out.println(p1);
	}

}

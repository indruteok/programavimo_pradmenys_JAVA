
public class JME_01_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ats = min(25, 37, 29);
		System.out.println("The smallest value is " + ats);
	}

	public static int min(int a, int b, int c) {

		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
	}
}

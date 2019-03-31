
public class Nested_loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 7;
		for (int row = 1; row <= size; ++row) {
			if ((row % 2) == 0) {
				System.out.print(" # ");
			}
			for (int col = 1; col <= size; ++col) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}

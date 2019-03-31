
public class Nested_loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A variantas");
		int size = 4;
		int sizeb = 8;
		for (int row = 1; row <= sizeb; ++row) {
			if ((row % 2) == 0) {
				System.out.print("# *");
			}
			for (int col = 1; col <= size; ++col) {
				System.out.print(" # * ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("B variantas");
		for (int row = 0; row < 8; row++) {
			for (int col = 8 - row; col > 0; col--) {
				System.out.print("# ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("C variantas");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("  ");
			for (int j = 0; j < 8 - i; j++)
				System.out.print("# ");
			System.out.println();
		}

		System.out.println();
		System.out.println("D variantas");
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(j + " ");
			for (int j = 0; j < 10 - i; j++)
				System.out.print(" ");
			System.out.println();
		}

		System.out.println();
		System.out.println("E variantas");
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= 1; j--)
				System.out.print((j <= i ? j : " ") + " ");
			System.out.println();
		}

		System.out.println();
		System.out.println("0 variantas");
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

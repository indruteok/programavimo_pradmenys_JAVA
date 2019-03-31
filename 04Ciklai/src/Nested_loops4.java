
public class Nested_loops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A variantas");
		{
			int size = 7;
		}
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.print((i % 7 <= 1) || (j % 7 <= 1) ? "# " : "  ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("B variantas");
		{
			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= 7; j++) {
					System.out.print((i % 7 <= 1) || (i == j) ? "# " : "  ");
				}
				System.out.println();
			}

			System.out.println();
			System.out.println("C variantas");
			{
				for (int i = 1; i <= 7; i++) {
					for (int j = 1; j <= 7; j++) {
						if ((i % 7 <= 1) || (i + j == 7 + 1)) {
							System.out.print("# ");
							continue;
						}
						System.out.print("  ");
					}
					System.out.println();
				}

				System.out.println();
				System.out.println("D variantas");
				{
					for (int i = 1; i <= 7; i++) {
						for (int j = 1; j <= 7; j++) {
							if ((i % 7 <= 1) || (i == j) || (i + j == 7 + 1)) {
								System.out.print("# ");
								continue;
							}
							System.out.print("  ");
						}
						System.out.println();
					}
				}
			}
		}

		System.out.println();
		System.out.println("E variantas");

		{
			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= 7; j++) {
					if ((i % 7 <= 1) || (j % 7 <= 1) || (i == j) || (i + j == 7 + 1)) {
						System.out.print("# ");
						continue;
					}
					System.out.print("  ");
				}
				System.out.println();
			}
		}
	}

}

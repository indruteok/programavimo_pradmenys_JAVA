import java.util.ArrayList;
import java.util.Scanner;

public class EN59 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// create here an ArrayList
		ArrayList<String> words = new ArrayList<String>();
		System.out.println("Type a word: ");
		while (true) {
			String word = reader.nextLine();

			if (word.isEmpty()) {
				break;
			} else {
				words.add(word);
			}

		}
		System.out.println("You typed the following words: ");
		for (int i = words.size() - 1; i >= 0; i--) {
			System.out.print(" " + words.get(i) + " ");
		}

	}
}

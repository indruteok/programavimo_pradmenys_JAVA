import java.util.ArrayList;
import java.util.Scanner;

public class EN57_jei_tuscia_stoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		System.out.println("Type a word: ");
		while (true) {
			String word = reader.nextLine();

			if (word.isEmpty()) {
				break;
			}
			words.add(word);
		}
		System.out.println("You typed the following words: ");
		for (String w : words) {
			System.out.println(w);

		}
		reader.close();
	}
}

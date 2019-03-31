import java.util.ArrayList;
import java.util.Scanner;

public class EN58_jei_kartojas_stoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		// create here the ArrayList
		ArrayList<String> words = new ArrayList<String>();
		while (true) {
			System.out.println("Type a word: ");
			String word = reader.nextLine();
			if (words.contains(word)) {
				System.out.println("You gave the word " + word + " twice");
				break;

			}
			words.add(word);
		}
		reader.close();
	}
}

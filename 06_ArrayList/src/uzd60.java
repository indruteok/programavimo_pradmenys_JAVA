import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class uzd60 {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
		// TODO Auto-generated method stub
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
			Collections.sort(words);
			System.out.println("You typed the following words: ");
			//for (int i = words.size() - 1; i >= 0; i--) {  // mazejimo tvarka
				for (int i =0;  i <= words.size() - 1; i++) {
				System.out.print(words.get(i));
			}
	}}

import java.util.Scanner;

public class EN_20_Usernames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Type your username:");
		String username = reader.nextLine();

		System.out.println("Type your username:");
		String password = reader.nextLine();
		reader.close();

		String username1 = "alex";
		String password1 = "mightyducks";

		String username2 = "emily";
		String password2 = "cat";

		if (username.equals(username1) && (password.equals(password1))) {
			System.out.println("You are now logged into the system!");
		} else if (username.equals(username2) && (password.equals(password2))) {
			System.out.println("You are now logged into the system!");
		} else {
			System.out.println("Your username or password was invalid!");
		}

	}
}

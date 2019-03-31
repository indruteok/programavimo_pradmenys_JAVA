import java.util.Scanner;

public class EN_22_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Type the password:");
		
		while (true) {
			String paswd = reader.nextLine();
		if (paswd.equals("carrot")) {
			System.out.println("The secret is: jryy qbar!");
		} else {
		System.out.println("Wrong!");
	
		}
		
}
	}
}

import java.util.Scanner;

public class EN_21_Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a year:");
		int year = reader.nextInt();

		reader.close();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0)) {
			System.out.println("The year is a leap year.");

		} else {
			System.out.println("The year is not a leap year.");

		}
	}
}

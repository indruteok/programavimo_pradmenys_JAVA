import java.util.Scanner;

public class JME_04_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		System.out.println("Input a year:");
		int metai = reader.nextInt();

		boolean ats = year(metai);
		System.out.println(ats);
	}

	public static boolean year(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}

}

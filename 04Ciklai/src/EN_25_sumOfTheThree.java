import java.util.Scanner;

public class EN_25_sumOfTheThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int read; // store numbers read form user in this variable

		System.out.println("Type the first number:");
		read = reader.nextInt();
		System.out.println("Type the second number:");
		read = reader.nextInt();
		System.out.println("Type the third number:");
		read = reader.nextInt();

//	        int i = 1;
//			while (i<0) {
		sum = sum + read;

		System.out.println("Sum: " + sum);

//		System.out.println("Type the first number:");
//		int num1 = reader.nextInt();
//		
//		System.out.println("Type the second number:");
//		int num2 = reader.nextInt();
//		
//		System.out.println("Type the third number:");
//		int num3 = reader.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		
//		System.out.println("Sum: " + sum);

	}

}

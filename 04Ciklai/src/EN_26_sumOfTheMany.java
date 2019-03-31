import java.util.Scanner;

public class EN_26_sumOfTheMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

//	            int read = Integer.parseInt(reader.nextLine());
//	            if (read == 0) {
//	                break;
//	            }
//
//	            // do something here
//
//	            System.out.println("Sum now: " + sum);
//	        }
//	        
//	        System.out.println("Sum in the end: " + sum);

		int sum = 0;

		while (true) {

			System.out.println("Type the numbers:");
			int num = reader.nextInt();
			sum = sum + num;

			if (num == 0) {
				System.out.println("Sum in the end: " + sum);
				break;
			}
			if (num > 0) {
				System.out.println(num);
				System.out.println("Sum now: " + sum);
			}
		}
	}
}

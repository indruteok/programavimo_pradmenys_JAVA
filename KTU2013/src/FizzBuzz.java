import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);

	        System.out.println("Type a number:");
			int a = reader.nextInt();
			
		if  ( a%5 == 0 && a%3 == 0 ) {
				System.out.println("FizzBuzz");
			 }
				else if  ( a%5 == 0) {
					System.out.println("Buzz");
				}
				else if ( a%3 == 0) {
					System.out.println("Fizz");	
			} else {
				System.out.println(a);
	}
		reader.close();
}
}


import java.util.Scanner;

public class LT06_kiek_dalikliu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Įveskite a ");
		int a =  reader.nextInt();
		System.out.println("Įveskite b");
		int b =  reader.nextInt();
		
		
		System.out.println("Daliklis k");
		int k =  reader.nextInt();
		
		int daliklis = 0;
		
		for(int i=a; i<=b; i++) {
			if(b % i == k){
			daliklis++;	
			
		}
		System.out.println("daliklis: " + daliklis);
		
		
		int total = 0;
		 int kiek = 0; 
		 
		 
		 for(int i=1; i<=k; i++) {
         if (a % k == 0)  
         { 
             while (a % k == 0)  
             { 
                 a = a / k; 
                 kiek++; 
             } 
             total = total * (kiek + 1); 
             
           
         } 
         System.out.println("kiek: " + kiek );
         System.out.println("t: " + total);
     } 
//	return total;	
	}
}

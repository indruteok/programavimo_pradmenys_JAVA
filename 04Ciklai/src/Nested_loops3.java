
public class Nested_loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j,i;
		int n= 9;
		System.out.println("Input upto the table number starting from 1 : ");
		
		System.out.println("Input upto the table number starting to 9 ");
		
		 for(i=1;i<=10;i++)
			   {
			     for(j=1;j<=n;j++)
			     {
			       if (j<=n-1) {
			    	   System.out.println( j +i +i*j);
			       } else
			        	  System.out.println(j +i +i*j);
			      }
			    
			     
			   }
	}
}

		
//		{
//			   int j,i,n;
//			   System.out.println("Input upto the table number starting from 1 : ");
//			   scanf("%d",&n);
//			   System.out.println("Multiplication table from 1 to %d \n",n);
//			   for(i=1;i<=10;i++)
//			   {
//			     for(j=1;j<=n;j++)
//			     {
//			       if (j<=n-1)
//			           printf("%dx%d = %d, ",j,i,i*j);
//			          else
//			        	  System.out.println("%dx%d = %d",j,i,i*j);
//
//			      }
//			     System.out.println("\n");



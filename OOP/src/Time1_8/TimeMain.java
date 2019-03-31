package Time1_8;


public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Time t1 = new Time(1, 59, 59);
		
		
		System.out.println("valanda " + t1.getHour());
		System.out.println("minute " + t1.getMinute());
		System.out.println("sekunde " + t1.getSecond());
		
		
		
		System.out.println(t1);
		System.out.println( "laikas padidinamas 1 sekunde:"); 
		System.out.println( t1.nextSecond()); 
		
		
	
	}

}

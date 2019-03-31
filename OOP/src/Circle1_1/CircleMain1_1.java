package Circle1_1;

public class CircleMain1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle1_1 c1 = new Circle1_1(5.0);
		Circle1_1 c2 = new Circle1_1(1.2);
		
		Circle1_1 c4 = new Circle1_1();
		
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c2.getArea());
		
		
		
		c4.setRadius(5.0);
		System.out.println("radius is: " + c4.getRadius()); 
		
		c4.setColor("green");        
		System.out.println("color is: " + c4.getColor()); 
		
		
		System.out.println(c1.toString());
		
		
		System.out.println(c2.toString());  
		// explicit call 
		System.out.println(c2);          
		// println() calls toString() implicitly, same as above 
		System.out.println("Operator '+' invokes toString() too: " + c2);  
		// '+' invokes toString() too 
		 
		
		
	//	System.out.println(c4.setRadius(4.0)); 
	}

}

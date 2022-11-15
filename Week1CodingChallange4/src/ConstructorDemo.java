/*
 Write an algorithm to create a class ConstructorDemo with default and parameterized constructors. 
 Introduce yourself in both default and parameterized constructors and execute them.

After writing the algorithm, write suitable code, run the program, and check the output.
 */

public class ConstructorDemo {

	public ConstructorDemo()
	{
	    System.out.println(" My name is Snehal Yogesh Kulkarni");
		System.out.println(" I am from Pune, Maharashtra");
		System.out.println(" I love to upgrade myself and knowldge sharing ");
		
	}
	
	public ConstructorDemo(String name, String location, String pro)
	{
		System.out.println(" My name is " + name );
		System.out.println(" I am from " + location);
		System.out.println(" I love to " +pro);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo constructorDemo; 
		
		System.out.println(" -----Default Constructor----- " );
		constructorDemo = new ConstructorDemo();
		
		
		System.out.println(" -----Parameterized Constructor----- " );
		constructorDemo = new ConstructorDemo(" Snehal Kulkarni", "Nashik", " share knowldge");
	}

}

/*
 Write a program to implement Constructor

Create a class ConstructorDemo.
Create a default constructor for the class and print “I am default constructor.”
Execute the constructor created.
Create a parameterized constructor with arguments of type  integer, float, string and character.
Print “I am Parameterized constructor. I take various arguments as input.”.
Create squares from integer and float values and print them in new lines.
Print string and character in new lines.
Execute the class constructors 
 */

public class ConstructorDemo1 {

	public ConstructorDemo1() { 

	       System.out.println("I am DEFAULT Constructor");

	       }

	       public ConstructorDemo1(int a, float b, char c, String S) {

	    	   System.out.println("\nI am Parameterized constructor.I take various argumentsas input.");
	    	   System.out.println("");
	    	   System.out.println("The square of an Integer numberis: " + a * a);
	    	   System.out.println("The square of a float numberis: " + b * b);
	    	   System.out.println("The string is:" + S);
	    	   System.out.println("The inputted character is: "+ c);

	       }

	       public void observations(){ 

	       System.out.println("inside Observations method");

	      }

	  public static void main(String[] args) {

	  ConstructorDemo1 demo, demo1;
	  
	  demo = new ConstructorDemo1();
	  
	  demo1 = new ConstructorDemo1(2, 3.4f, 'y', "SnehYog");

	  }
}

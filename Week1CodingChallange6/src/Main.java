/*
 Write a program in java to exploit constructor overloading. (cube and cuboid volume calculation)

i) Create a class ThreeDimensionShape with three variables  width, height, depth of type double;
ii) Create three constructors 
       1.Doesn’t accepts any parameter
       2.Accepts 1 parameter of type double(length)
       3.Accepts 3 parameters of type double(width, height, depth)
iii) Create a method volume of return type double that returns a product of width, height, and depth.

iv) in case of No argument constructor make length=width=depth = 0;
v) in case of 1 argument constructor make length=width=depth = value passed;

 */

import java.util.*;
class ThreeDimensionShape

{
    double width, height, depth;

   // constructor used when all dimensions are defined
  ThreeDimensionShape (double w, double h, double d)

    {
       width = w;
       height = h;
       depth = d;
    }

// constructor used when one dimension is defined
    ThreeDimensionShape (double l)
    {

        width = height = depth = l;
    }

    // constructor used when no dimension is specified
    ThreeDimensionShape() 

    { 
    	width = height = depth = 0;
    } 

    // compute and return volume
     double volume()

    {
        return width * height * depth;
    }

}
// Driver code 

public class Main 

{ 

    public static void main(String args[]) 

    {   // create boxes using the various 
        // constructors 
     
     double volume;
    	
     Scanner sc = new Scanner(System.in);	
     
     // get first shape
     System.out.println(" Enter width :: "); 
     int w = sc.nextInt();
     
     System.out.println(" Enter height :: "); 
     int h = sc.nextInt();
     
     System.out.println(" Enter depth :: "); 
     int d = sc.nextInt();
     
      
    
     ThreeDimensionShape shape1 = new ThreeDimensionShape(w,h,d);
     
     volume = shape1.volume(); 

     System.out.println(" Volume of shape1 is " + volume); 


     // get shape2
     ThreeDimensionShape shape2 = new ThreeDimensionShape();

     volume = shape2.volume(); 

     System.out.println(" Volume of shape2 is " + volume); 


     // get shape3
     System.out.println(" Enter length :: "); 
     int l = sc.nextInt();
     
     ThreeDimensionShape shape3 = new ThreeDimensionShape(l); 

     volume = shape3.volume(); 

     System.out.println(" Volume of shape3 is " + volume); 

    } 

} 
import java.util.*;
public class Area {

    final float pi = 22 / 7;

    float radius, area = 0;

 

public void calculateArea(){

    area = pi * radius * radius;

    System.out.println(" Area of circle is: " + area);

}

 

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	
        Area obj = new Area();

        System.out.println("Enter Radius of Circle ::");
        obj.radius = sc.nextFloat();
        obj.calculateArea();

    }

}
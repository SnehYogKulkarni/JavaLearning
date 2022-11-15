/* 
 Question

Write an algorithm to create a class Customer that contains 

          fullName(String) and age(int) as variables in class. 

Create a main method, assign values to the variables in the main method and print the values of variables using the object of Customer class in the main method. 

After writing the algorithm, write suitable code, run the program, and check the output.

 

Algorithm

Step 1: Start

. . .

. . .

. . .

Step n: Stop

Solution  
 Algorithm:
   a.Start 
   b.Create a class Customer
   c.Create string and integer variable fullName and age respectively.
   d.Create  main method in the same classe. Create an object customer of class Customer inside the main method
   f.Accept your name in fullName variable and your age in age variable from getInput method  
   h. Display output using putOutput method
   i.Stop
 */
import java.util.*;

class Customer {

	String fullName;
	int age;
	
	void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Name of Customer :: ");
		this.fullName = sc.nextLine();
		System.out.println(" Enter Age of Custmoer :: ");
		this.age = sc.nextInt();
		
			
	}
	
	void putOutput()
	{
		System.out.println(" Output ---------");
		System.out.println(" Name of Customer :: " + this.fullName);
		System.out.println(" Age of Customer  :: "+ this.age);

	}
	
	public Customer() {
		
	}

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		System.out.println(" Enter Information of Custmoer ---------");
		
		customer.getInput();
		
		customer.putOutput();
	}

}

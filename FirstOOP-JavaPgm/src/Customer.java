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
	
	public Customer() {
		
	}

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		System.out.println(" Enter Information of Custmoer ---------");
		
		c.getInput();
		
		System.out.println(" Output ---------");
		System.out.println(" Name of Customer :: " + c.fullName);
		System.out.println(" Age of Customer  :: "+ c.age);

	}

}

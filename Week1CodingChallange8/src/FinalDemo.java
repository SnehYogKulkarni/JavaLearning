/*
 Write a program to do the following

Create integer non-static variable var1 and a static variable var2 and assign value 10 to var1 & var2.
create two methods method1 and method2.
In method1, use increment operator to increment var1 and use print statement to print var1.
Similarly perform for method2 with var2.
Create three objects obj1, obj2, obj3.
Execute method1 with all the objects.
Similarly perform for method2.
(Optional) Replace static with final for var2 and run the program. Note your observations.
 
 */

public class FinalDemo {
	int var1 = 10;
	final int var2 = 10;
	public void method1() {
		var1++;
		System.out.println(var1);
		}
	public void method2() {
		//var2++;          ------------------  Compilation Error as this is modifying final variable
		System.out.println(var2);
		}
	
	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo ();
		FinalDemo obj2 = new FinalDemo ();
		FinalDemo obj3 = new FinalDemo ();
		System.out.println("Using non-final keyword");
		obj.method1();
		obj2.method1();
		obj3.method1();
		System.out.println("\nUsing final keyword");
		obj.method2();
		obj2.method2();
		obj3.method2();
		}
	}

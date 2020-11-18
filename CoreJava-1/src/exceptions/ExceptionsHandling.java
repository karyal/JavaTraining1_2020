package exceptions;
import java.util.Scanner;

public class ExceptionsHandling {
	public static void main(String[] args) {
		//f1();
		//f2();
		//f3();
	}
	
	public static void f3() {
		try {
			int nums[] = {3, 4, 5, 6, 2};
			System.out.println(nums[2]);
			System.out.println(nums[0]/0);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error-1 : "+ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println("Error-2 : "+ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Error-3 : "+ex.getMessage());
		}
		finally {
			System.out.println("Finally Block!");
		}
	}
	public static void f2() {
		try {
			int n1, n2, n3;
			//n1 = 9;
			//n2 = 4;
			System.out.print("Enter first no : ");
			n1 =  Integer.parseInt(new Scanner(System.in).nextLine());//89
			System.out.print("Enter second no : "); 
			n2 =  Integer.parseInt(new Scanner(System.in).nextLine()); //0
			
			//Validation
			if (n2 !=0) {
				n3 = n1/n2; //java.lang.ArithmeticException: / by zero
				System.out.println("Result "+n3);
			}
			else {
				System.out.println("Error : "+"n2 Cann't be zero");
			}			
		}
		catch(ArithmeticException ex) {
			System.out.println("Error1 : "+ex.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
	}
	
	public static void f1() {
		try {
			int n1, n2, n3;
			//n1 = 9;
			//n2 = 4;
			System.out.print("Enter first no : ");
			n1 =  Integer.parseInt(new Scanner(System.in).nextLine());//89
			System.out.print("Enter second no : "); 
			n2 =  Integer.parseInt(new Scanner(System.in).nextLine()); //0
			
			n3 = n1/n2; //java.lang.ArithmeticException: / by zero
			System.out.println("Result "+n3);
		}
		catch(ArithmeticException ex) {
			System.out.println("Error1 : "+ex.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
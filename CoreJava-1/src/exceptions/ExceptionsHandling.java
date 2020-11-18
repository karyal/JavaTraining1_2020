package exceptions;
import java.util.Scanner;

public class ExceptionsHandling {
	public static void main(String[] args) {
		//f1();
		f2();
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
package exceptions;

public class ExceptionsTest {

	public static void main(String[] args) {
		//Syntax Error
		System.out.println("Hello"); //Syntax error, insert ")" to complete Expression
		System.out.println("Hi"); //String literal is not properly closed by a double-quoteString literal is not properly closed by a double-quote
		
		//Logical Error
		int n1, n2, n3;
		n1 = 58;
		n2 = 5;
		//n3 = n1*n2; // 290
		n3 = n1+n2; // 63
		System.out.println("Result : "+n3);
	}

}

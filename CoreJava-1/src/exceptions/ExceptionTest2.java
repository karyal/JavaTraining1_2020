package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
	}
	
	//IOException - Checked Exception
	public static String readString() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =  new BufferedReader (isr); 
		//return "";
		return br.readLine();
	}
	
	public static String readString(String msg) {
		System.out.print(msg);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =  new BufferedReader (isr); 
		//return "";
		return br.readLine();
	}

}

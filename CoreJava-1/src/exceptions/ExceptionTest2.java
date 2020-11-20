package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.Exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
	}
	
	//IOException - Checked Exception
	public static String readString() {
		InputStreamReader isr ;
		BufferedReader br;
		String tmp_str="";
		try {
			isr = new InputStreamReader(System.in);
			br =  new BufferedReader (isr); 
			tmp_str = br.readLine(); //Checked Exception
		}
		catch(IOException ex) {//Checked Exception
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {//Unchecked Exception
			System.out.println(ex.getMessage());
		}
		return (tmp_str);
	}
	
	public static String readString(String msg) throws IOException, Exception{
		System.out.print(msg);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =  new BufferedReader (isr); 
		//return "";
		return br.readLine();
	}
}
package utilities;

import java.io.IOException;

public class StartProgram {

	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("mspaint");
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
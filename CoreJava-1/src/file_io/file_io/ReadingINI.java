package file_io.file_io;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingINI {
	public static void main(String[] args) {
		try {
			Properties p = new Properties();
			//p.load(new FileInputStream("C:\\Users\\Krishna\\Desktop\\info.ini"));
			p.load(new FileInputStream("info.ini"));
			System.out.println("Host: "+p.getProperty("host"));
			System.out.println("Port : "+p.getProperty("port"));
			System.out.println("DB : "+p.getProperty("db"));
			System.out.println("USER : "+p.getProperty("user"));
			System.out.println("PASS : "+p.getProperty("pass"));
		}
		catch(Exception ex) {
			System.out.println("Erro : "+ex.getMessage());
		}
	}
	
///HW - Nov 29, 2020
	//Task-0 Writing values on ini file.
	// Task-1 Writing/Reading values from xml file
	// Task-2 Writing/Reading values from csv file	
}
package file_io.file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterBufferedReader {
	final String FILE_NAME = "data2.txt";
	
	public void write_data(String str) throws IOException{
		FileWriter fileWriter = new FileWriter(FILE_NAME);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(str);
		bufferedWriter.close();
		fileWriter.close();
	}
	
	public void read_data() throws IOException{
		FileReader fileReader = new FileReader(FILE_NAME);
		BufferedReader bufferedReader = new BufferedReader (fileReader);
		String tmp_line = bufferedReader.readLine();
		System.out.println(tmp_line);
		bufferedReader.close();
		fileReader.close();		
	}
	
	public static void main(String[] args) throws IOException {
		String str_text="Java.io class package includes almost all operations of input and output needs.";		
		new BufferedWriterBufferedReader().write_data(str_text);
		new BufferedWriterBufferedReader().read_data();		
	}
}
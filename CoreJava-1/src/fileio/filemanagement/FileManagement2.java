package fileio.filemanagement;
import java.io.File;
import java.io.IOException;

public class FileManagement2 {

	public static void main(String[] args) throws IOException{
		
		File f1 = new File("data1.txt");
		File f2 = new File("data2.txt");
		File f3 = new File("data3.txt");
		
		boolean result = f1.exists();
		System.out.println(result);		
		if (result==false) {
			f1.createNewFile();
			System.out.println("Create new file successfully.");
		}
		else {
			System.out.println("File already exists");
			
			//Test
			System.out.println("Execute : "+f1.canExecute());
			System.out.println("Read : "+f1.canRead());
			System.out.println("Write : "+f1.canWrite());
			
			int result1 = f1.compareTo(f2);
			if (result1==0) {
				System.out.println("Compare : Equals");
			}
			else {
				System.out.println("Compare : Not Equals");
			}
			
			//Delete
			if(f3.exists()==true) {
				if(f3.delete()==true) {
					System.out.println("Delete file successfully");
				}
				else {
					System.out.println("Error : Cannt delete file.");
				}
			}
			else {
				System.out.println("File does not exists.");
			}
		}
		
	}
}
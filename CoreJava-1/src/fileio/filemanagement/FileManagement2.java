package fileio.filemanagement;
import java.io.File;
import java.io.IOException;

public class FileManagement2 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("data2.txt");
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

			//Path
			String path1 = f1.getAbsolutePath();
			System.out.println("Path : "+path1);

			String path2 = f1.getCanonicalPath();
			System.out.println("Path : "+path2);

			//Name, Parent
			String name = f1.getName();
			String parent = f1.getParent();
			String path3 = f1.getPath();

			System.out.println("Name : "+name);
			System.out.println("Parent: "+parent);
			System.out.println("Path: "+path3);

			//totalspace
			long total_space = f1.getTotalSpace();
			System.out.println("Total Space : "+total_space/1024/1024/1024+" GB");

			if(f1.isDirectory()==true) {
				System.out.println("f1 is Directory");
			}
			else {
				System.out.println("f1 is File");
			}

			//last modified
			Long last_modified = f1.lastModified();
			System.out.println("Last Modified "+last_modified);//1606260703039 - timstamp (unix system) -> Date/time format

			//length
			long length = f1.length();
			System.out.println("Length : "+length);

			//hashcode
			int hash_code1 = f1.hashCode();
			System.out.println("Hashcode: "+hash_code1);
			int hash_code2 = f2.hashCode();
			System.out.println("Hashcode: "+hash_code2);

			if(hash_code1==hash_code2) {
				System.out.println("f1 is Equals with f2");
			}
			else {
				System.out.println("f1 is not Equals with f2");
			}
			
			//Equals
			if(f1.equals(f2)) {
				System.out.println("f1 is Equals with f2");
			}
			else {
				System.out.println("f1 is not Equals with f2");
			}
		}
	}
}

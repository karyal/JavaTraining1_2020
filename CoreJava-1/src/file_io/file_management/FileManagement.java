package file_io.file_management;

import java.io.File;

import java.io.IOException;
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html

public class FileManagement {			
	static String FILE_NAME = "d:/data.txt";	
	
	public static void f1() throws IOException {
		//File Object Initialization
		File file = new File(FILE_NAME);

		//Creating new File
		if(file.exists()==true) {
			System.out.println("File already exist.");
		}
		else {
			boolean result = file.createNewFile();		
			if (result==true) {
				System.out.println("File create successfully");
			}
			else {
				System.out.println("Can't create file");
			}
		}
	}

	public static void main(String[] args) throws IOException, Exception {		
		f1();
		//f2();
		//f3();
		//f4();
		//f5("D:/");
		
		//Task:-
			//Create a files explorer which can explore files and folders of specific folder/drive.
	}
	
	public static void f5(String file_name) {
		try {
			File f = new File(file_name);
			if (f.isDirectory()) {
				File []files = f.listFiles();
				System.out.println(files.length);
				for(File file : files) {
					if (file.isFile())
						System.out.println(file.getName()+" File");
					else
						System.out.println(file.getName()+" Dir");
				}				
			}			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}		
	}
	
	public static void f4() {
		//Manage Directory
		try {
			File file1 = new File("d:/MyDir");						
			if(file1.exists()==false) {
				if(file1.mkdir()==true) {
					System.out.println("Create directory successfully");
				}				
			}
			else {
				System.out.println("Directory MyDir already exist");
			}
			
			File file2 = new File("d:/MyDir/MyDir1/MyDir2/MyDir3");
			file2.mkdirs();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void f3() {
		//File(String pathname)
		File file1 = new File(FILE_NAME);  
		
		//System.out.println(file1.pathSeparator);//; String
		//System.out.println(file1.pathSeparatorChar); //; char
		//System.out.println(file1.separator);//String
		//System.out.println(file1.separatorChar);//char
		
		System.out.println(file1.getName()); //data.txt
		System.out.println(file1.getPath()); //d:\data.txt
		System.out.println(file1.getAbsolutePath()); //d:\data.txt
		System.out.println(file1.getParent()); //d:\
		
		System.out.println(file1.canExecute());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		
		File f1 = new File("d:/data.txt");
		File f2 = new File("d:/data1.txt");
		File f3 = f1; //Copy by reference
		File f4 = new File("d:/doc1.odt");
		
		System.out.println(f1.compareTo(f3)); //0 - Equals | >0, <0 - Not Equals		
		System.out.println(f1.delete());
		//System.out.println(f4.delete());		
		//f4.deleteOnExit();
		System.out.println(f2.getFreeSpace()/1024/1024/1024+" GB");
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.isHidden());
		
		System.out.println(f1.equals(f3));
		
		/*
		if(file1.exists()==false) {
			boolean result = file1.createNewFile();//Checked Exceptions | IOException
			if (result == true) {
				System.out.println("Create new file successfuly.");
			}
			else {
				System.out.println("Error : to create new file.");
			}
		}	
		else {
			System.out.println("File already exists!");
		}
		*/
	}
	public static void f2() {
		try {
			//File(String pathname)
			File file1 = new File(FILE_NAME);  			
			//System.out.println(file1.pathSeparator);//; String
			//System.out.println(file1.pathSeparatorChar); //; char
			//System.out.println(file1.separator);//String
			//System.out.println(file1.separatorChar);//char			
			boolean result = file1.createNewFile();
			System.out.println(result);			
		}
		catch(IOException ex) {
			System.out.println("Error1 : "+ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Error2 : "+ex.getMessage());
		}		
	}
}
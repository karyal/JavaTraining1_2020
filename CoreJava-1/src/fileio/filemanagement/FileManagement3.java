package fileio.filemanagement;

import java.io.File;

public class FileManagement3 {
	public static void main(String[] args) {
		f1();

	}
	
	public static void f1() {
		//boolean	mkdir()
		//boolean	mkdirs()
		boolean res1;
		File f = new File("MyFolder/Mf2/Mf3/Mf4");
		if (f.exists()==true) {
			System.out.println("Folder already exist");
		}
		else {
			//create directory
			//res1 = f.mkdir(); //Single folder
			res1 = f.mkdirs();//Folder within folder
			if (res1==true) {
				System.out.println("Folder create successfully");
			}
			else {
				System.out.println("Error to create folder.");
			}
		}		
	}

}

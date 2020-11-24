package fileio.filemanagement;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FileManagement {

	public static void main(String[] args) throws Exception{
		//Accessing Fields of File Class		
		File f = new File("data1.txt");		
		Class c1 = f.getClass();
		
		Field []fields = c1.getDeclaredFields();		
		System.out.println("Total Fields : "+fields.length);		
		//Fields
		for(Field field : fields) {
			String field_name = field.getName();
			field.setAccessible(true);
			Object value = field.get(f);			
			System.out.println("Field Name : "+field_name+" = "+value);
		}
		System.out.println();
		
		//Methods
		Method methods[] = c1.getDeclaredMethods();
		System.out.println("Total Methods: "+methods.length);
		for(Method method : methods) {
			System.out.println(method.getReturnType()+" "+method.getName()+" "+method.getParameterCount());
		}
		
	}
}

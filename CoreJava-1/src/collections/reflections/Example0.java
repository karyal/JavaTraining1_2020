package collections.reflections;

public class Example0 {
	public static void main(String[] args) {
		try {
			//Getting Class Information
			Class c1 = Class.forName("Person1");			
			
			Person1 p2 = new Person1();
			Class c2 = p2.getClass();
			
			Class c3 = Person1.class;			
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Error : "+ex);
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex);
		}
		
	}
}

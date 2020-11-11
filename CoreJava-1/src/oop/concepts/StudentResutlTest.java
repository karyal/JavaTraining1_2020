package oop.concepts;
public class StudentResutlTest {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Rajan","One","A");
		NewStudent s2 = new NewStudent(65, 67, 70, 45);
		
		//s2 .calcTotal();
		//s2.calcAverage();
		//s2.calcResult();
		s2.processResult();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}

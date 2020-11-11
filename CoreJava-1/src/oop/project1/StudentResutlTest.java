package oop.project1;
public class StudentResutlTest {
	public static void main(String[] args) {
		//Student s1 = new Student(1,"Rajan","One","A");
		//NewStudent s2 = new NewStudent(65, 67, 70, 45);
		
		//s2 .calcTotal();
		//s2.calcAverage();
		//s2.calcResult();
		//s2.processResult();
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		NewStudent2 s02 = new NewStudent2(1,"Rajan","One","A",65, 67, 70, 45);
		s02.processResult();
		System.out.println(s02);
		
	}
}

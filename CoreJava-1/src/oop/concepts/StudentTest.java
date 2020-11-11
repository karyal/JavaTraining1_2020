package oop.concepts;

public class StudentTest{
	public static void main(String[] args) {
		//Student s1 = new Student();
		//s1.studentId=1;//can't access private
		//s1.setStudentID(1);
		//s1.fullName="Rajan";
		//s1.grade="One";
		//s1.section="A";

		//System.out.println(s1.studentId+", "+s1.fullName+", "+s1.grade);
		//System.out.println(s1.getSudentID()+", "+s1.fullName+", "+s1.grade);

		//Student s1= new Student();
		//s1.setStudentID(1);
		//s1.setFullName("Rajan Subedi");
		//s1.setGrade("One");
		//s1.setSection("A");

		//System.out.println(s1.getSudentID()+", "+s1.getFullName()+", "+s1.getGrade()+", "+s1.getSection());
		//System.out.println(s1);
		
		Student s1;
		Student s2;
		Student s3;
		
		s1 = new Student();//Default Constructor | Set Default Values
		s2 = new Student(20, "Raj Thapaa", "Ones", "Aa");
		
		//Re-set value
		s1.setStudentID(1);
		s1.setFullName("Kiran Rai");
		s1.setGrade("One");
		s1.setSection("A");
		
		s2 = new Student(2, "Raj Sharma", "One", "A");//Re-Initialize
		
		System.out.println(s1);
		System.out.println(s2);
		
		s3 = s1;
		System.out.println(s3);
		s3.setStudentID(3);
		System.out.println(s3);
		System.out.println(s1);
		
		//Equals to ==
		if (s1==s2) {
			System.out.println("s1 and s2 are equals");
		}
		else if (s1== s3) {
			System.out.println("s1 and s3 are equals");
		}
		else if (s2 == s3) {
			System.out.println("s2 and s3 are equals");
		}
		
		int code1 = s1.hashCode();
		int code2 = s2.hashCode();
		int code3 = s3.hashCode();
		
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
		
		//hashCode()
		if (code1==code2) {
			System.out.println("s1 and s2 are equals");
		}
		else if (code1 == code3) {
			System.out.println("s1 and s3 are equals");
		}
		else if (code2 == code3) {
			System.out.println("s2 and s3 are equals");
		}
		
		//equals
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 are equals");
		}
		else if (s1.equals(s3)) {
			System.out.println("s1 and s3 are equals");
		}
		else if (s2.equals(s3)) {
			System.out.println("s2 and s3 are equals");
		}
	}
}
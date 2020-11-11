package oop.concepts;
/*
//V1
class Student{
	//Instance variable
	int rollNo;
	String fullName;
	String grade;
}

public class StudentTest {
	public static void main(String[] args) {

		Student s1 = new Student();//Object of Student

		s1.rollNo=1;
		s1.fullName="Rajan";
		s1.grade="One";

		System.out.println(s1.rollNo+", "+s1.fullName+", "+s1.grade);

	}
}
*/

//Encapsulation - Complete Class
class Student{
	//Instance Variable
	/*
	private int studentId; //Private Access Specifier
	protected String fullName; //Protected Access Specifier
	public String grade;//Public Access Specifier
	String section;//Default Access Specifier
	 */

	//Instance Variables
	private int studentId; //Private Access Specifier
	private String fullName; //Protected Access Specifier
	private String grade;//Public Access Specifier
	private String section;//Default Access Specifier

	//Constructors	
	//Default Constructor
	public Student() {
		this.studentId=0;
		this.fullName="";
		this.grade="";
		this.section="";
	}
	
	//Parameterized Constructor | User Given Values - Assignment - Object Initialization Time
	public Student(int studentId, String fullName, String grade, String section) {
		this.studentId=studentId;
		this.fullName=fullName;
		this.grade=grade;
		this.section=section;
	}
	
	//getters
	public int getSudentID() {
		return this.studentId;
	}
	public String getFullName() {
		return this.fullName;
	}
	public String getGrade() {
		return this.grade;
	}
	public String getSection() {
		return this.section;
	}

	//setter
	public void setStudentID(int studentId) {
		this.studentId=studentId;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public void setSection(String section) {
		this.section=section;
	}
	
	public String toString() {
		return this.studentId+", "+this.fullName+", "+this.grade+", "+this.section;
	}
}
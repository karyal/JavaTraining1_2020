package oop.project1;

//enum RESULT{PASS, FAIL};

//Inheritance
//Inherit Resources from Parent Class (Inheritance) and Add New Features (Encapsulation)

//Encapsulation

//Inheritance
	//All Public
	//All Protected

class NewStudent2 extends Student{
	//Data Members | Member Variables | Instance Variables
	private double sub1;
	private double sub2;
	private double sub3;
	private double sub4;
	
	private double total;
	private double average;
	//private String result;
	private RESULT result;
	
	//Default Constructor | Object Initialization Time - with default values
	public NewStudent2() {
		super();
		this.sub1=0.0;
		this.sub2=0.0;
		this.sub3=0.0;
		this.sub4=0.0;
		
		this.total=0.0;
		this.average=0.0;
		//this.result="";
		this.result=RESULT.FAIL;
	}
	
	//Parameterized Constructor | Object Initialization Time - with user given values
	public NewStudent2(int studentId, String fullName, String grade, String section, double sub1, double sub2, double sub3, double sub4) {
		super(studentId, fullName, grade, section);
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		
		this.total=0.0;
		this.average=0.0;
		//this.result="";
		this.result=RESULT.FAIL;
	}
	
	//Getters
	public double getSub1() {
		return (this.sub1);
	}
	public double getSub2() {
		return (this.sub2);
	}
	public double getSub3() {
		return (this.sub3);
	}
	public double getSub4() {
		return (this.sub4);
	}
	public double getTotal() {
		return (this.total);
	}
	public double getAverage() {
		return (this.average);
	}
	/*
	public String getResult() {
		return (this.result);
	}
	*/
	public RESULT getResult() {
		return (this.result);
	}
	
	//Setters
	public void setSub1(double sub1) {
		this.sub1=sub1;
	}
	public void setSub2(double sub2) {
		this.sub2=sub2;
	}
	public void setSub3(double sub3) {
		this.sub3=sub3;
	}
	public void setSub4(double sub4) {
		this.sub4=sub4;
	}
	
	//Processing Methods
	public void calcTotal() {
		this.total = this.sub1+this.sub2+this.sub3+this.sub4;
	}
	
	public void calcAverage() {
		//this.average = this.total/4;
		this.average = this.total/Global.SUBJECTS;
	}
	
	public void calcResult() {
		//if (this.sub1>=40 && this.sub2>=40 && this.sub3>=40 && this.sub4>=40) {
		if (this.sub1>=Global.PM && this.sub2>=Global.PM && this.sub3>=Global.PM && this.sub4>=Global.PM) {
			//this.result="PASS";
			this.result=RESULT.PASS;
		}
		else {
			//this.result="FAIL";
			this.result=RESULT.FAIL;
		}
	}
	
	public void processResult() {
		this.calcTotal();
		this.calcAverage();
		this.calcResult();
	}
	
	public String toString() {
		return (super.toString()+", "+this.sub1+", "+this.sub2+", "+this.sub3+", "+this.sub4+", "+this.total+", "+this.average+", "+this.result);
	}
}
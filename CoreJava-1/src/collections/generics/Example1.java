package collections.generics;
/*
public class Example1 {
	//Instance Variable
	private Object t;
	//Object - Accept any type of values
	
	public Object get() {
		return this.t;
	}	
	
	public void set(Object t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		Example1 obj1 = new Example1();
		obj1.set(2);
		System.out.println(obj1.get());		
		
		obj1 = new Example1();
		obj1.set(2.035);
		System.out.println(obj1.get());
		
		obj1 = new Example1();
		obj1.set("Mt. Everest");
		System.out.println(obj1.get());
		
		int nums[]= {4,5,6,7,8};
		obj1 = new Example1();
		obj1.set(nums);
		//Object nums2 = obj1.get();					
	}
}

public class Example1<T>{
	private T t;
	
	public T get() {
		return this.t;
	}	
	
	public void set(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Example1 obj1 = new Example1();
		obj1.set(true);
		System.out.println(obj1.get());
	}
}


//Generic Type Interfaces
interface Inf1<T1, T2>{
	void print_info(T1 t1, T2 t2);
	void newLine();
}

public class Example1 implements Inf1{	
	@Override
	public void print_info(Object t1, Object t2) {
		// TODO Auto-generated method stub
		System.out.print(t1+" : "+t2);
	}
	
	@Override
	public void newLine() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Example1 obj1 = new Example1();
		obj1.print_info("Name", "Rajan");	
		obj1.newLine();
		obj1.print_info("First No", 154);
		obj1.newLine();
		obj1.print_info("Salary", 258369.124);	
		obj1.newLine();
	}
}

/*
//Generic Type Constructor & Method
public class Example1<T> {
	private T t1;
	
	public Example1(T t1) {
		this.t1 = t1;
	}
	public void set(T t1) {
		this.t1 = t1;
	}
	public T get() {
		return this.t1;
	}
}
*/

//Generic Type Arrays
public class Example1<T>{
	private Object[] myArray;
	private int counter = 0;
	
	public Example1() {
		myArray=new Object[100];
	}
	
	public Object get(int index) {
		return this.myArray[index];
	}
	
	public void add(Object item) {
		this.myArray[counter++]=item;
	}	
	
	public void print() {
		for(int i =0; i<counter; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Example1 obj1 = new Example1();
		
		obj1.add(2);
		obj1.add(1.10);
		obj1.add('A');
		obj1.add("Ktm");
		
		obj1.print();
	}
}

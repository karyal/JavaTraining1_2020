package threads;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=100; i++) {
			System.out.println("i = "+i+" ");
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		//obj1.run();
		//obj2.run();		
		obj1.start();
		obj2.start();
	}
}

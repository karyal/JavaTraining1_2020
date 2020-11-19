package threads;

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i =1; i<=10; i++) {			
			try {
				System.out.println(i+" ");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		MyThread2 obj1 = new MyThread2();
		MyThread2 obj2 = new MyThread2();
		
		obj1.run();
		obj2.run();
	}

}

package threads;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i=1; i<=10;i++) {
			System.out.println("i = "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		th1.start();
		th2.start();
	}
}

package threadconcept;

public class ThreadExample extends Thread
{

	public void run() {
		for(int i=0; i<10; i++) {
			//int k = i/0;
			System.out.println("Run Method");
		}
	}
	
	public static void main(String[] args) {
//		Thread thread1 = new Thread();
//		thread1.start();
		ThreadExample ex = new ThreadExample();
		Thread thread1 = new Thread(ex);
		thread1.start();
//		System.out.println(thread1.getId());
//		System.out.println(thread1.getName());
//		System.out.println(thread1.getPriority());
		//ex.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Method");
		}
	}
	
}

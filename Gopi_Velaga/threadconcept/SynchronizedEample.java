package threadconcept;

public class SynchronizedEample extends Thread {

	private int value = 0;

	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			value = value + i;
		}
	}

	public static void main(String[] args) {
		SynchronizedEample obj = new SynchronizedEample();
		obj.start();
		System.out.println("Value: " + obj.value);
		System.out.println("Value: " + obj.value);
	}

}

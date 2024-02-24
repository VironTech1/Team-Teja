package threadconcept;

public class Example2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread() + " Run Method");
        }
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        Thread thread1 = new Thread(obj);
        System.out.println(thread1.getState());
        System.out.println(thread1.isAlive());
        thread1.setName("Thread1");
        // thread1.setPriority(10);
        thread1.start();
        System.out.println(thread1.getState());
        System.out.println(thread1.isAlive());

        // 1. sleep() method
        try {
            System.out.println("Main thread sleeping for 2 seconds...");
            //Thread.sleep(10000); // Sleep for 2 seconds (2000 milliseconds)
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2. yield() method
        System.out.println("Main thread yielding...");
        Thread.yield(); // Suggests that the current thread is willing to yield its execution time

        // 3. join() method
        try {
            System.out.println("Main thread waiting for thread1 to finish...");
            thread1.join(); // Wait for thread1 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread() + " Main Method");
        }
    }
}

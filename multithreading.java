public class multithreading extends Thread {
    private String threadName;

    // Constructor to name the thread
    multithreading (String name) {
        threadName = name;
    }

    // Override the run() method to define the thread's task
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: iteration " + i);
            try {
                Thread.sleep(500);  // Sleep for 500 milliseconds (to simulate work)
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " has finished.");
    }
}

class multithreadingExample {
    public static void main(String[] args) {
        // Create two threads
        multithreading  thread1 = new multithreading ("Thread 1");
        multithreading  thread2 = new multithreading ("Thread 2");

        // Start both threads
        thread1.start();  // This will call the run() method of thread1
        thread2.start();  // This will call the run() method of thread2

        // Optionally, you can wait for both threads to finish using join()
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have finished execution.");
    }
}

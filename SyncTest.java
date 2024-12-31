class MyThread extends Thread {
    void Table(int n) {
        synchronized (this) {

            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
            }
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName() + " is Completed and Sleeping for 500 ms...");
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
class SyncTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        Thread obj1 = new Thread(() -> t1.Table(5));
        obj1.start();
        Thread obj2 = new Thread(() -> t1.Table(3));
        obj2.start();
    }
}

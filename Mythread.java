
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i + " from " + Thread.currentThread().getName());
//             try {
//                 Thread.sleep(500); // Pausing execution for 1 second
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Mythread t1 = new Mythread();
//         Mythread t2 = new Mythread();
//         t1.start(); // Starting thread t1
//         t2.start(); // Starting thread t2
//     }
// }
// class hello extends Thread {
//     public void run() {
//         try {
//             for (int i = 0; i < 10; i++) {
//                 // System.out.println("this is run method inside thread");
//                 System.out.println(i + " from " + Thread.currentThread().getName());
//                 Thread.sleep(2000); // milisecond
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Thread hello Interrupted");
//         }
//         System.out.println("Hello thread running...");
//     }
// }
// class Mythread {
//     public static void main(String[] args) {
//         hello t1 = new hello();
//         hello t2 = new hello();
//         t1.start();
//         t2.start();
//         t1.interrupt();
//         System.out.println("id of thread is " + t1.getName());
//         // System.out.println("id of thread is " + t1.getId());
//         System.out.println("priority of thread is " + t1.getPriority());
//         System.out.println("priority of thread is " + t2.getPriority());
//     }
// }
// class c1 extends Thread{
//     //cunstructor of c1
//     public c1(String name){
//             super(name);
//     }
//     public void run(){
//             System.out.println(currentThread().getName() + " is running " + currentThread().getPriority());
//     }
// }
// class Mythread extends Thread {
//     public static void main(String[] args) {
//         c1 obj1 = new c1("Thread-1");
//         c1 obj2 = new c1("Thread-2");
//         c1 obj3 = new c1("Thread-3");
//         c1 obj4 = new c1("Thread-4");
//         c1 obj5 = new c1("Thread-5");
//         // set name of the threads
//         obj1.setName("T1");
//         System.out.println(obj1.isAlive());
//         // Set different Priority
//         obj1.setPriority(Thread.MAX_PRIORITY);
//         obj2.setPriority(8);
//         obj3.setPriority(3);
//         obj4.setPriority(10);
//         obj5.setPriority(10);
//         //Run the Threads
//         obj1.start();
//         System.out.println(obj1.isAlive());
//         obj2.start();
//         obj3.start();
//         obj4.start();
//         obj5.start();       
//     }
// }


// Use of Yield Method
class M extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " in control");

            try {
                sleep(300);
                
            } catch (Exception e) {
            }
        }
    }
}

public class Mythread {
    public static void main(String[] args) throws Exception{
        M t = new M();
        t.start();

        
        for (int i = 0; i < 5000; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " in control" + " with Priority " +Thread.currentThread().getPriority());
        }
    }
}

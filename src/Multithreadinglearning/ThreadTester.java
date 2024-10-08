package Multithreadinglearning;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("main is starting");
//        Thread thread = new Thread(() -> {
//            System.out.println(Thread.currentThread());
//        }, "New thread");
//        thread.start();
//        try{
//            thread.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("main is exiting");
//        Thread thread1 = new Thread1("thread1");
////        thread1.setDaemon(true);
//        thread1.start();
//        Thread thread2 = new Thread(() ->{
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread() + ", " + i);
//            }
//        }, "thread2");
//        thread2.start();
//        Stack stack = new Stack(5);
//        new Thread(() ->{
//            int counter = 0;
//            while (++ counter < 10){
//                System.out.println("pushed: " + stack.push(100));
//            }
//        }, "Pusher").start();
//        new Thread(() ->{
//            int counter = 0;
//            while (++ counter < 10){
//                System.out.println("popped: " + stack.pop());
//            }
//        }, "Popper").start();
        String lock1 = "dhinesh";
        String lock2 = "M";
        Thread thread1 = new Thread(() ->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        } ,"thread1");
        Thread thread2 = new Thread(() -> {
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("lock acquired");
                }
            }
        }, "thread2");

        thread1.start(); thread2.start();
    }
}

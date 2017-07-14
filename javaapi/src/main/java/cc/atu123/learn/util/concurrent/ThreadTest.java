package cc.atu123.learn.util.concurrent;

/**
 * Created by atu on 2017/7/12.
 */
public class ThreadTest {
    String flag = "true";
    Thread thread1 = new Thread(new Runnable() {
        public void run() {
            synchronized (flag){
                try {
                    System.out.println("thread1 wait");
                    flag.wait();
                    System.out.println("thread1 sleep");
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i am thread1");
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    });
    Thread thread2 = new Thread(new Runnable() {
        public void run() {
            System.out.println("i am thread2");
            try {
                synchronized (flag) {
                    System.out.println("thread1 will be notify");
                    flag.notify();
                    Thread.yield();
                    System.out.println("thread2 continue");
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();
        threadTest.thread1.start();
        threadTest.thread2.start();
        System.out.println(Thread.currentThread().getId());
        System.out.println(threadTest.thread1.getId());
        Thread.sleep(2000L);
        threadTest.thread1.join();
        System.out.println("thread1 finished");
        threadTest.thread2.join();
        System.out.println("thread2 finished");
    }
}

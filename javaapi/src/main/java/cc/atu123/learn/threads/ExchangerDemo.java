package cc.atu123.learn.threads;

import java.util.concurrent.Exchanger;

/**
 * @author wang.lichong  2019/5/15 下午2:52
 * @desc
 * @since
 */
public class ExchangerDemo {
    public static void main(String[] args) throws InterruptedException {
        final Exchanger<String> exchanger = new Exchanger<String>();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("线程1等待接受");
                    String content = exchanger.exchange("thread1");
                    System.out.println("线程1收到的为：" + content);
                } catch (InterruptedException e) {}
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("线程2等待接受并沉睡3秒");
                    Thread.sleep(3000);
                    String content = exchanger.exchange("thread2");
                    System.out.println("线程2收到的为：" + content);
                } catch (InterruptedException e) {}
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                try {
                    String content = exchanger.exchange("thread3");
                    System.out.println("线程3收到的为：" + content);
                } catch (InterruptedException e) {}
            }
        });


        Thread thread4 = new Thread(new Runnable() {
            public void run() {
                try {
                    String content = exchanger.exchange("thread4");
                    System.out.println("线程4收到的为：" + content);
                } catch (InterruptedException e) {}
            }
        });


        thread1.start();
        thread2.start();
        thread3.start();
        //thread4.start();
    }
}

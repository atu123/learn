package cc.atu123.learn.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wang.lichong  2019/5/16 下午3:00
 * @desc
 * @since
 */
public class SemaphoreDemo {


    public static void main(String[] args) throws InterruptedException {
        final Semaphore semaphore = new Semaphore(10);
        final CountDownLatch countDownLatch = new CountDownLatch(10);

        final AtomicInteger number = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    try {
                        semaphore.acquire();
                        number.incrementAndGet();

                        countDownLatch.countDown();

                    } catch (Exception e) {

                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        countDownLatch.await();

        System.out.println(number);
        Thread.sleep(10000);
        System.out.println("共" + number.get() + "个线程获得到信号");
        System.exit(0);
    }

}

package cc.atu123.learn.threads;

import java.util.concurrent.CountDownLatch;

/**
 * @author wang.lichong  2019/5/16 下午2:54
 * @desc
 * @since
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 10; i++) {
            final int number = i + 1;
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    System.out.println("执行任务[" + number + "]");
                    System.out.println("完成任务[" + number + "]");

                    countDownLatch.countDown();
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        System.out.println("主线程开始等待...");
        countDownLatch.await();
        System.out.println("主线程执行完毕...");
    }
}
